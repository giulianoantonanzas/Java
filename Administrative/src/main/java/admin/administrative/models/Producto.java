/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin.administrative.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author patyg
 */
@Entity(name = "producto")
@Table(name = "producto")
public class Producto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto", unique = true)
    private long id_producto;

    @Column(name = "nombre")
    private String nombre;
    @Column(name = "detalle")
    private String detalle;
    @Column(name = "precio_peso")
    private float precio_peso;
    @Column(name = "precio_dolar")
    private float precio_dolar;
    @Column(name = "cantidad")
    private int cantidad;

    public Producto() {
    }

    public Producto(String nombre, String detalle, float precio_peso, float precio_dolar, int cantidad) {
        this.nombre = nombre;
        this.detalle = detalle;
        this.precio_peso = precio_peso;
        this.precio_dolar = precio_dolar;
        this.cantidad = cantidad;
    }

    public long getId_producto() {
        return id_producto;
    }

    public void setId_producto(long id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public float getPrecio_peso() {
        return precio_peso;
    }

    public void setPrecio_peso(float precio_peso) {
        this.precio_peso = precio_peso;
    }

    public float getPrecio_dolar() {
        return precio_dolar;
    }

    public void setPrecio_dolar(float precio_dolar) {
        this.precio_dolar = precio_dolar;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
