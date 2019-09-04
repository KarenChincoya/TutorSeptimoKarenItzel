package teatro;
public class Hora {
	private int hora;
	private int minuto;
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getMinuto() {
		return minuto;
	}
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}
	public Hora() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hora(int hora, int minuto) {
		super();
		this.hora = hora;
		this.minuto = minuto;
	}	
}
