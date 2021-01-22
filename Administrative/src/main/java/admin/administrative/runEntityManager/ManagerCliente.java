/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin.administrative.runEntityManager;

import admin.administrative.models.Cliente;
import admin.administrative.models.Factura;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 *
 * @author patyg
 */
public class ManagerCliente {

    EntitiesManager em;

    public ManagerCliente() {
        em = new EntitiesManager();
    }

    public void removeCliente(Cliente cliente) {
        em = new EntitiesManager();
        em.getManager().getTransaction().begin();
        cliente = em.getManager().merge(cliente);
        em.getManager().remove(cliente);
        em.getManager().getTransaction().commit();
        em.getManager().close();
    }

    public void removeClienteAndConections(Cliente cliente) {
        /*Anterior mente, eliminaba las ventas donde habia el cliente seleccionado , ahora simplemente le
        seteo un valor nulo a la factura en donde esta ese cliente. asi permanese la factura y la consatancia. solo que 
        no va a mostrar de quien es la factura, esto depende mucho del deseo del cliente , si quiere que se eliminen las 
        ventas , simplemente se descomenta lo quee esta comentado y se quita lo que esta hecho en la factura (darle valor nulo al cliente),
        luego simplemente remuevo esa venta.*/

        em = new EntitiesManager();
        em.getManager().getTransaction().begin();
        CriteriaBuilder cb = em.getManager().getCriteriaBuilder();
        //CriteriaQuery<Venta> cqVenta = cb.createQuery(Venta.class);
        CriteriaQuery<Factura> cqFactura = cb.createQuery(Factura.class);
        //Root<Venta> rootVentas = cqFactura.from(Venta.class);
        Root<Factura> rootFacturas = cqFactura.from(Factura.class);

        Predicate condicionFactura = cb.equal(rootFacturas.get("cliente"), cliente);

        cqFactura.select(rootFacturas).where(condicionFactura);
        List<Factura> resultadoFacturas = em.getManager().createQuery(cqFactura).getResultList();

        /*Predicate condicionVenta = cb.equal(rootVentas.get("factura"), resultadoFacturas);
        List<Venta> resultadoVentas = em.getManager().createQuery(cqVenta).getResultList();*/
        for (int i = 0; i < resultadoFacturas.size(); i++) {
            resultadoFacturas.get(i).setCliente(null);//pongo en la venta un valor nulo
            em.getManager().merge(resultadoFacturas.get(i));
            //em.getManager().remove(resultadoVentas.get(i)); //elimino las ventas , como esta activado el modo cascada, cuando elimine la venta eliminara todo lo que hay en ella(factura, cliente ,etc)
            //em.getManager().remove(resultadoFacturas.get(i)); //elimino las facturas
        }

        cliente = em.getManager().merge(cliente);
        em.getManager().remove(cliente);//elimino al cliente
        em.getManager().getTransaction().commit();
        em.getManager().close();

    }

    public void addCliente(Cliente cliente) {
        em = new EntitiesManager();
        em.getManager().getTransaction().begin();
        em.getManager().persist(cliente);
        em.getManager().getTransaction().commit();
        em.getManager().close();
    }

    public void margeCliente(Cliente cliente) {
        em = new EntitiesManager();
        em.getManager().getTransaction().begin();
        em.getManager().merge(cliente);
        em.getManager().getTransaction().commit();
        em.getManager().close();
    }

    public List<Cliente> getClientes() {
        em = new EntitiesManager();
        em.getManager().getTransaction().begin();
        List<Cliente> clientes = em.getManager().createQuery("SELECT c FROM cliente c", Cliente.class).getResultList();
        em.getManager().close();

        return clientes;
    }

    public Cliente getCliente(Object id) {
        em = new EntitiesManager();
        em.getManager().getTransaction().begin();
        Cliente cliente = em.getManager().find(Cliente.class, id);
        em.getManager().close();

        return cliente;
    }

    //esta funcion sirve para instanciar la taba donde hay clientes y darle los valores que almasena el cliente
    public String[] clienteAtributosString() {
        return new String[]{"id_cliente", "apellido", "nombre", "fecha de nacimiento"};
    }

    public void instanciarTablaCliente(javax.swing.JTable tablaClientes, int cantClientes) {
        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
                new Object[cantClientes][clienteAtributosString().length],
                clienteAtributosString()
        ) {
            Class[] types = new Class[]{
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false
            };
        });

        tablaClientes.getTableHeader().setReorderingAllowed(false);
    }

    public void darValoresTabla(javax.swing.JTable tablaClientes, List<Cliente> clientes) {
        if (clientes.size() > 0) {
            for (int i = 0; i < clientes.size(); i++) {
                tablaClientes.getModel().setValueAt(clientes.get(i).getId_cliente(), i, 0);
                tablaClientes.getModel().setValueAt(clientes.get(i).getApellido(), i, 1);
                tablaClientes.getModel().setValueAt(clientes.get(i).getNombre(), i, 2);
                tablaClientes.getModel().setValueAt(new SimpleDateFormat("dd-MM-yyyy").format(clientes.get(i).getFecha_nacimiento()), i, 3);
            }
        }
    }

    public List<Cliente> buscarCliente(String condicion) {
        em = new EntitiesManager();
        em.getManager().getTransaction().begin();

        List<Cliente> clientes = em.getManager().createQuery(
                "SELECT c FROM cliente c where c.nombre='" + condicion + "' OR c.apellido='" + condicion + "'", Cliente.class)
                .getResultList();
        
        em.getManager().close();
        
        return clientes;
    }

}
