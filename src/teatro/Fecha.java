package teatro;
public class Fecha extends Hora {
	private int day;
	private int month;
	private int year;
	private Hora hora;
	public Fecha(int hora, int minuto, int day, int month, int year) {
		super(hora, minuto);
		// TODO Auto-generated constructor stub
		this.day = day;
		this.month = month;
		this.year = year;
	}
}
