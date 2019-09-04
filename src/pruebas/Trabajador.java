package pruebas;
import java.util.*;
public class Trabajador extends Persona {
	private int horasTrabajadas;
	public Trabajador(String nombre, String apellidoPat, String apellidoMat, String direccion, int edad, int telefono, int horasTrabajadas) {
		super(nombre, apellidoPat, apellidoMat, direccion, edad, telefono);
		// TODO Auto-generated constructor stub
		this.horasTrabajadas = horasTrabajadas;
	}
	public void imprimirSalario() {
		System.out.println("Salario: "+(this.horasTrabajadas*170.35));
	}
	public static void main(String[] Args) {
		System.out.println("Ingrese los datos que se solicitan");	
		String nombre;
		String apellidoPat;
		String apellidoMat;
		String direccion;
		int edad;
		int telefono;
		int horasTrabajadas;	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nombre");
		nombre = scanner.nextLine();
		System.out.println("Apellido paterno: ");
		apellidoPat = scanner.nextLine();
		System.out.println("Apellido materno: ");
		apellidoMat = scanner.nextLine();
		System.out.println("Direccion: ");
		direccion = scanner.nextLine();
		System.out.println("Edad: ");
		edad = scanner.nextInt();
		System.out.println("Telefono: ");
		telefono = scanner.nextInt();
		System.out.println("Horas trabajadas: ");
		horasTrabajadas = scanner.nextInt();
		Trabajador t = new Trabajador(nombre, apellidoPat, apellidoMat, direccion, edad, telefono, horasTrabajadas);
		t.imprimirSalario();
	}
}
