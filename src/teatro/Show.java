package teatro;
import java.util.HashMap;
public class Show {
	private int id;
	private String nombre;
	
	HashMap<String, Funcion> funciones = new HashMap<String, Funcion>();
	public Show() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public HashMap<String, Funcion> getFunciones() {
		return funciones;
	}
	public void setFunciones(HashMap<String, Funcion> funciones) {
		this.funciones = funciones;
	}
	
}
