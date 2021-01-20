/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin.administrative.models;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author patyg
 */
@Entity(name = "usuario")
@Table(name = "usuario")
public class Usuario implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    @Id
    @Column(name = "nombre_usuario", unique = true)
    private String nombre_usuario;
    @Column(name = "contrasenia")
    private String contrasenia;

    public Usuario() {
    }

    public Usuario(String nombre_usuario, String contrasenia) {
        this.nombre_usuario = nombre_usuario;
        this.contrasenia = contrasenia;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        String oldNombre_usuario = this.nombre_usuario;
        this.nombre_usuario = nombre_usuario;
        changeSupport.firePropertyChange("nombre_usuario", oldNombre_usuario, nombre_usuario);
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        String oldContrasenia = this.contrasenia;
        this.contrasenia = contrasenia;
        changeSupport.firePropertyChange("contrasenia", oldContrasenia, contrasenia);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
    
    
    
    
}
