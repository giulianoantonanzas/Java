package modeloClases;

public class Ciudadano extends Persona {

    
        private String patente;
        
	private String domicilio;

	public Ciudadano (String patente, String domicilio) {
		super();
            
		this.domicilio = domicilio;
		
		this.patente = patente;
		
	}
	
	public Ciudadano() {
		
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}
	
	
	
}
