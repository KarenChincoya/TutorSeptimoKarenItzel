package mx.ulsa.modelo;

public class EmpleadoModelo {

	private String nombre;
	private int id;
	private boolean activo;
	
	public EmpleadoModelo() {}
	
	public EmpleadoModelo(String nombre, int id, boolean activo) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.activo = activo;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	
}
