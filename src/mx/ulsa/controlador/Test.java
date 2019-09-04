package mx.ulsa.controlador;

public class Test {

	public static void main(String[] Args) {
		//Integer[][] matriz3 = { { 2, 4, 6 }, { 9, 5, 1 }, { 7, 3, 8 } };
		Integer[][] matriz3 = { { 6, 1, 8 }, { 7, 5, 3 }, { 2, 9, 4 } };

		Integer[][] matriz4 = { { 16, 3, 2, 13 }, { 5, 10, 11, 8 }, { 9, 6, 7, 12 }, { 4, 15, 14, 1 }, };

		Cuadro cuadro = new Cuadro(3, matriz3);
		System.out.println(cuadro.isMagico());
	}
}
