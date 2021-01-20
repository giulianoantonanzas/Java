/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin.administrative.models;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author patyg
 */
@Entity(name = "productos_facturados")
@Table(name = "productos_facturados")
public class ProductoFacturado implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto_facturado", unique = true)
    private long id_producto_facturado;

    @OneToOne(cascade = {CascadeType.REFRESH,CascadeType.MERGE,CascadeType.DETACH})
    @JoinColumn(name = "id_producto")
    private Producto producto;

    @Column(name = "cantidad")
    private int cantidad;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_detalle_factura")
    private DetalleFactura detalle_factura;

    public ProductoFacturado() {
    }

    public ProductoFacturado(Producto producto, DetalleFactura id_detalle_factura, int cantidad) {
        this.producto = producto;
        this.detalle_factura = id_detalle_factura;
        this.cantidad = cantidad;
    }

    public ProductoFacturado(Producto producto, int cantidad, DetalleFactura id_detalle_factura) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.detalle_factura = id_detalle_factura;
    }

    public ProductoFacturado(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public long getId_producto_facturado() {
        return id_producto_facturado;
    }

    public void setId_producto_facturado(long id_producto_facturado) {
        this.id_producto_facturado = id_producto_facturado;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public DetalleFactura getDetalle_factura() {
        return detalle_factura;
    }

    public void setDetalle_factura(DetalleFactura detalle_factura) {
        this.detalle_factura = detalle_factura;
    }

}
