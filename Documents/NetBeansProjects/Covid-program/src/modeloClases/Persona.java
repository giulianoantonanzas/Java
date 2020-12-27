package modeloClases;

public class Persona {

    private int DNI;
    private String apellido;
    private String nombre;
    private int edad;
    private String localidad;
    private String genero;
    private boolean actividadEscencial;

    public Persona(int DNI, String apellido, String nombre, int edad, String localidad, String genero, boolean actividadEscencial) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.localidad = localidad;
        this.genero = genero;
        this.actividadEscencial = actividadEscencial;
    }

    public Persona(int DNI){
        this.DNI=DNI;
    }

    public Persona() {
        // TODO Auto-generated constructor stub
    }
    
    public Persona(int DNI, String apellido){
        this.DNI=DNI;
        this.apellido=apellido;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isActividadEscencial() {
        return actividadEscencial;
    }

    public void setActividadEscencial(boolean actividadEscencial) {
        this.actividadEscencial = actividadEscencial;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

}
