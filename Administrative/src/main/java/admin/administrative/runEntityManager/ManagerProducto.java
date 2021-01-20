/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin.administrative.runEntityManager;

import admin.administrative.models.Producto;
import admin.administrative.models.ProductoFacturado;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 *
 * @author patyg
 */
public class ManagerProducto {

    EntitiesManager em;

    public ManagerProducto() {
    }

    public void removeProducto(Producto producto) {
        em = new EntitiesManager();
        em.getManager().getTransaction().begin();
        producto = em.getManager().merge(producto);
        em.getManager().remove(producto);
        em.getManager().getTransaction().commit();
        em.getManager().close();
    }

    public void removeProductoAndConections(Producto producto) {
        em = new EntitiesManager();
        em.getManager().getTransaction().begin();

        CriteriaBuilder cb = em.getManager().getCriteriaBuilder();
        CriteriaQuery<ProductoFacturado> cqProductosFacturados = cb.createQuery(ProductoFacturado.class);
        Root<ProductoFacturado> rootProductosFacturados = cqProductosFacturados.from(ProductoFacturado.class);

        Predicate queryProductosFacturados = cb.equal(rootProductosFacturados.get("producto"), producto);
        cqProductosFacturados.select(rootProductosFacturados).where(queryProductosFacturados);

        List<ProductoFacturado> productosFacturados = em.getManager().createQuery(cqProductosFacturados).getResultList();

        for (int i = 0; i < productosFacturados.size(); i++) {
            em.getManager().remove(productosFacturados.get(i));
        }

//revisar ya que cuando se elimina el cliente, tambien se elimina el producto y viceversa.
        producto = em.getManager().merge(producto);
        em.getManager().remove(producto);
        em.getManager().getTransaction().commit();
        em.getManager().close();
    }

    public void addProducto(Producto producto) {
        em = new EntitiesManager();
        em.getManager().getTransaction().begin();
        em.getManager().persist(producto);
        em.getManager().getTransaction().commit();
        em.getManager().close();
    }

    public void margeProducto(Producto producto) {
        em = new EntitiesManager();
        em.getManager().getTransaction().begin();
        em.getManager().merge(producto);
        em.getManager().getTransaction().commit();
        em.getManager().close();
    }

    public List<Producto> getProductos() {
        em = new EntitiesManager();
        em.getManager().getTransaction().begin();
        List<Producto> productos = (List<Producto>) em.getManager().createQuery("SELECT p FROM producto p", Producto.class).getResultList();
        em.getManager().close();
        return productos;
    }

    public Producto getProducto(Object id) {
        em = new EntitiesManager();
        em.getManager().getTransaction().begin();
        Producto producto = em.getManager().find(Producto.class, id);
        em.getManager().close();

        return producto;
    }

    //esta fucion existe para decir los valores que caracterizan al producto. y va a mostrar la tabla, esto hace que si cambio
    //el los valores, aqui van a impactar.Y asi la tablas pueden cambiar facilmente
    public String[] productosAtributosString() {
        return new String[]{"id_Producto", "Cantidad", "Nombre", "Detalle", "Precio Peso", "Precio Dolar"};
    }

    public void inicializarTabla(javax.swing.JTable tablaProductos, int cantProduct) {
        //genero una nueva tabla (aunque ya exista una ,simplemente la sobre pongo)
        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
                new Object[cantProduct][productosAtributosString().length],
                productosAtributosString()
        ) {
            Class[] types = new Class[]{
                java.lang.Long.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false
            };
        });
        
        tablaProductos.getTableHeader().setReorderingAllowed(false);
    }

    public void darValoresTabla(javax.swing.JTable tablaProductos, List<Producto> productos) {
        //le doy los valores a la tabla. (con los productos alamsenados que se pasan como parametro
        for (int i = 0; i < productos.size(); i++) {
            tablaProductos.getModel().setValueAt(productos.get(i).getId_producto(), i, 0);
            tablaProductos.getModel().setValueAt(productos.get(i).getCantidad(), i, 1);
            tablaProductos.getModel().setValueAt(productos.get(i).getNombre(), i, 2);
            tablaProductos.getModel().setValueAt(productos.get(i).getDetalle(), i, 3);
            tablaProductos.getModel().setValueAt(productos.get(i).getPrecio_peso(), i, 4);
            tablaProductos.getModel().setValueAt(productos.get(i).getPrecio_dolar(), i, 5);
        }
    }
}
