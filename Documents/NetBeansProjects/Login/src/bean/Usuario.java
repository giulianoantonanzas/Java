package bean;

public class Usuario {

	private String Id_usuario;
	private String nombre;
	private String apellido;
	private String clave;

	public Usuario(String id_usuario, String nombre, String apellido, String clave) {

		this.Id_usuario = id_usuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.clave = clave;
	}

	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public String getId_usuario() {
		return Id_usuario;
	}

	public void setId_usuario(String id_usuario) {
		this.Id_usuario = id_usuario;
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

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

}
