package psw;

public class EmpleadoInformacion {
	
	private String name = "Ningun nombre especificado";
	private String employeeID = "Ningun ID especificado";
	private int numChildren = 0;
	private boolean isMarried = false;
	
	public String getName() {
		return(name);
	}

	/**
	 * Filtro para prevenir caracteres especiales HTML
	 */
	
	public void setName(String name) {
		this.name = PswUtilidades.filter(name);
	}
	
	public String getEmployeeID() {
		return(employeeID);
	}
	/**
	 * Filtro para prevenir caracteres especiales HTML
	 */
	public void setEmployeeID(String employeeID) {
		this.employeeID = PswUtilidades.filter(employeeID);
	}

	public int getNumChildren() {
		return numChildren;
	}

	public void setNumChildren(int numChildren) {
		this.numChildren = numChildren;
	}

	public boolean isMarried() {
		return isMarried;
	}

	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	
	
}
