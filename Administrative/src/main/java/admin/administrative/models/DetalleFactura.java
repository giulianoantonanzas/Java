/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin.administrative.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author patyg
 */
@Entity(name = "detalle_factura")
@Table(name = "detalle_factura")
public class DetalleFactura implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detalle_factura", unique = true)
    private long id_detalle_factura;

    @OneToMany(mappedBy = "detalle_factura", cascade = {CascadeType.ALL})
    private List<ProductoFacturado> productos_facturados;

    @Column(name = "iva")
    private int iva;

    @Column(name = "total_pagar_peso")
    private float total_pagar_peso;

    @Column(name = "total_pagar_dolar")
    private float total_pagar_dolar;

    public DetalleFactura() {

    }

    public DetalleFactura(List<ProductoFacturado> productos_facturados, int iva, float total_pagar_peso, float total_pagar_dolar) {
        this.productos_facturados = productos_facturados;
        this.iva = iva;
        this.total_pagar_peso = total_pagar_peso;
        this.total_pagar_dolar = total_pagar_dolar;
    }

    public List<ProductoFacturado> getProductos_facturados() {
        return productos_facturados;
    }

    public void setProductos_facturados(List<ProductoFacturado> productos_facturados) {
        this.productos_facturados = productos_facturados;
    }

    public float getTotal_pagar_peso() {
        return total_pagar_peso;
    }

    public void setTotal_pagar_peso(float total_pagar_peso) {
        this.total_pagar_peso = total_pagar_peso;
    }

    public float getTotal_pagar_dolar() {
        return total_pagar_dolar;
    }

    public void setTotal_pagar_dolar(float total_pagar_dolar) {
        this.total_pagar_dolar = total_pagar_dolar;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public long getId_detalle_factura() {
        return id_detalle_factura;
    }

    public void setId_detalle_factura(long id_detalle_factura) {
        this.id_detalle_factura = id_detalle_factura;
    }

}
