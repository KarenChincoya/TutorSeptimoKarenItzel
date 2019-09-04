package teatro;
public class Funcion {
	private Fecha fecha;
	private Integer A;
	private Integer B;
	private Integer C;
	private Integer D;
	public Funcion(Fecha fecha, Integer a, Integer b, Integer c, Integer d) {
		super();
		this.fecha = fecha;
		A = a;
		B = b;
		C = c;
		D = d;
	}
	public Fecha getFecha() {
		return fecha;
	}
	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}
	public Integer getA() {
		return A;
	}
	public void setA(Integer a) {
		A = a;
	}
	public Integer getB() {
		return B;
	}
	public void setB(Integer b) {
		B = b;
	}
	public Integer getC() {
		return C;
	}
	public void setC(Integer c) {
		C = c;
	}
	public Integer getD() {
		return D;
	}
	public void setD(Integer d) {
		D = d;
	}
}
