/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin.administrative.models;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author patyg
 */

@Entity (name = "factura")
@Table(name="factura")
public class Factura implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_factura", unique = true)
    private long id_factura;
    
    @ManyToOne(cascade = {CascadeType.REFRESH,CascadeType.MERGE,CascadeType.DETACH})
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
    
    @Column(name = "fecha_facturacion")
    @Temporal(TemporalType.DATE)
    private Date fecha_facturacion;

    @Column(name = "tipo_factura")
    private String tipo_factura;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_detalle_factura")
    private DetalleFactura detalle_factura;
    

    public Factura(){
        
    }

    public Factura(Cliente cliente, Date fecha_facturacion, String tipo_factura, DetalleFactura detalle_factura) {
        this.cliente = cliente;
        this.fecha_facturacion = fecha_facturacion;
        this.tipo_factura = tipo_factura;
        this.detalle_factura = detalle_factura;
    }

    public long getId_factura() {
        return id_factura;
    }

    public void setId_factura(long id_factura) {
        this.id_factura = id_factura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFecha_facturacion() {
        return fecha_facturacion;
    }

    public void setFecha_facturacion(Date fecha_facturacion) {
        this.fecha_facturacion = fecha_facturacion;
    }

    public String getTipo_factura() {
        return tipo_factura;
    }

    public void setTipo_factura(String tipo_factura) {
        this.tipo_factura = tipo_factura;
    }

    public DetalleFactura getDetalle_factura() {
        return detalle_factura;
    }

    public void setDetalle_factura(DetalleFactura detalle_factura) {
        this.detalle_factura = detalle_factura;
    }

    
}
