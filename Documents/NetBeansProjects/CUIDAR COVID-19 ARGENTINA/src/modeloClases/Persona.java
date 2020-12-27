/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloClases;

/**
 *
 * @author patyg
 */
public class Persona {
    //Se registra el apellido,nombre, dni, genero, edad, localidad 
    String apellido;
    String nombre;
    int DNI;
    String genero;
    int edad;
    String localidad;
    boolean esEscencial;
    
    
    Persona(){
        
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public boolean isEsEscencial() {
        return esEscencial;
    }

    public void setEsEscencial(boolean esEscencial) {
        this.esEscencial = esEscencial;
    }
    
    
}
