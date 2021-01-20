/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin.administrative.runEntityManager;

import admin.administrative.models.Venta;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 *
 * @author patyg
 */
public class ManagerVenta {

    EntitiesManager em;

    public ManagerVenta() {
        em = new EntitiesManager();
    }

    public void addVenta(Venta venta) {
        em = new EntitiesManager();
        em.getManager().getTransaction().begin();
        em.getManager().persist(venta);
        for (int i = 0; i < venta.getFactura().getDetalle_factura().getProductos_facturados().size(); i++) {
            em.getManager().merge(venta.getFactura().getDetalle_factura().getProductos_facturados().get(i));
        }

        em.getManager().getTransaction().commit();
        em.getManager().close();
    }

    public void mergeVenta(Venta venta) {
        em = new EntitiesManager();
        em.getManager().getTransaction().begin();
        em.getManager().merge(venta);
        em.getManager().getTransaction().commit();
        em.getManager().close();
    }

    public void removeVenta(Venta venta) {
        em = new EntitiesManager();
        em.getManager().getTransaction().begin();
        venta = em.getManager().merge(venta);
        em.getManager().remove(venta);
        em.getManager().getTransaction().commit();
        em.getManager().close();
    }

    public void removeVentaAndConections(Venta venta) {
        em = new EntitiesManager();
    }

    public Venta getVenta(Object id) {
        em = new EntitiesManager();
        em.getManager().getTransaction().begin();
        Venta venta = em.getManager().find(Venta.class, id);
        em.getManager().close();

        return venta;

    }

    public List<Venta> getVentas() {
        em = new EntitiesManager();
        em.getManager().getTransaction().begin();
        List<Venta> ventas = em.getManager().createQuery("SELECT v FROM venta v", Venta.class).getResultList();
        em.getManager().close();
        return ventas;
    }

    public String[] ventasAtributosString() {
        return new String[]{"ID_Venta", "ID_Factura", "Fecha de Facturacion",
            "Tipo de Factura", "Nombre del Cliente", "Apellido dle Cliente",
            "Total a Pagar (PESO)", "Total a Pagar (Dolar)"};
    }

    public void inicializarTabla(javax.swing.JTable tablaVenta, int cantVenta) {
        //creo una tabla vacia
        tablaVenta.setModel(new javax.swing.table.DefaultTableModel(
                new Object[cantVenta][ventasAtributosString().length],
                ventasAtributosString()
        ) {
            Class[] types = new Class[]{
                java.lang.Long.class, java.lang.Long.class,
                java.lang.Object.class, java.lang.String.class,
                java.lang.String.class, java.lang.String.class,
                java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false, false, false
            };
        });
        tablaVenta.getTableHeader().setReorderingAllowed(false);
    }

    public void darValoresTabla(javax.swing.JTable tablaVenta, List<Venta> ventas) {
        for (int i = 0; i < ventas.size(); i++) {
            tablaVenta.getModel().setValueAt(ventas.get(i).getId_venta(), i, 0);
            tablaVenta.getModel().setValueAt(ventas.get(i).getFactura().getId_factura(), i, 1);
            tablaVenta.getModel().setValueAt(new SimpleDateFormat("dd-MM-yyyy").format(ventas.get(i).getFactura().getFecha_facturacion()), i, 2);
            tablaVenta.getModel().setValueAt(ventas.get(i).getFactura().getTipo_factura(), i, 3);
            tablaVenta.getModel().setValueAt(ventas.get(i).getFactura().getDetalle_factura().getTotal_pagar_peso(), i, 6);
            tablaVenta.getModel().setValueAt(ventas.get(i).getFactura().getDetalle_factura().getTotal_pagar_dolar(), i, 7);
            if(ventas.get(i).getFactura().getCliente()!= null){// si no esta vacio el nombre del cliente.. (osease, si existe un cliente)
                tablaVenta.getModel().setValueAt(ventas.get(i).getFactura().getCliente().getNombre(), i, 4);
                tablaVenta.getModel().setValueAt(ventas.get(i).getFactura().getCliente().getApellido(), i, 5);
            }
                
            

        }
    }

}
