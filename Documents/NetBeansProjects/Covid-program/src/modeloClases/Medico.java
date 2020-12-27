package modeloClases;

public class Medico extends Persona {

    private int numeroMatricula;
    private String especialidad;

    public Medico(int numeroMatricula, String especialidad, int DNI) {

        super(DNI);

        this.numeroMatricula = numeroMatricula;

        this.especialidad = especialidad;

    }

    public Medico(int numeroMatricula, String especialidad) {

        super();

        this.numeroMatricula = numeroMatricula;

        this.especialidad = especialidad;

    }

    public Medico() {
        super();
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

}
