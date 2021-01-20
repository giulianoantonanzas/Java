package modeloClases;

import java.util.ArrayList;

public class GestionDiagnostico {

        private int idGestionDiagnostico;
	private ArrayList<Persona> listadoPersonas;
	private ArrayList<Diagnostico> listadoDiagnosticos;

        
    public GestionDiagnostico(int idGestionDiagnostico,ArrayList<Persona> listadoPersonas, ArrayList<Diagnostico> listadoDiagnosticos) {
        this.idGestionDiagnostico=idGestionDiagnostico;
        this.listadoPersonas = listadoPersonas;
        this.listadoDiagnosticos = listadoDiagnosticos;
    }

    public int getIdGestionDiagnostico() {
        return idGestionDiagnostico;
    }

    public void setIdGestionDiagnostico(int idGestionDiagnostico) {
        this.idGestionDiagnostico = idGestionDiagnostico;
    }

    public GestionDiagnostico(){
        listadoPersonas=new ArrayList<Persona>();
        listadoDiagnosticos=new ArrayList<Diagnostico>();
    }
    
    public ArrayList<Persona> getListadoPersonas() {
        return listadoPersonas;
    }

    public void setListadoPersonas(ArrayList<Persona> listadoPersonas) {
        this.listadoPersonas = listadoPersonas;
    }

    public ArrayList<Diagnostico> getListadoDiagnosticos() {
        return listadoDiagnosticos;
    }

    public void setListadoDiagnosticos(ArrayList<Diagnostico> listadoDiagnosticos) {
        this.listadoDiagnosticos = listadoDiagnosticos;
    }
	


	
}
