package psw;

public class PswUtilidades {

	public static final String DOCTYPE = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0" + "Transitional//EN\">\n";

	public static String encabezado(String titulo) {
		return (DOCTYPE + "\n" + "<HTML>\n" + "<HEAD><TITLE>" + titulo + "</TITLE></HEAD>");
	}

	public static String filter(String cadenaEntrada) {
		if(!tieneCaracteresEspeciales(cadenaEntrada)) {
			return(cadenaEntrada);
		}
		StringBuffer bufferFiltro = new StringBuffer(cadenaEntrada.length());
		char c;
		for(int i=0; i<cadenaEntrada.length(); i++) {
			c = cadenaEntrada.charAt(i);
			switch(c) {
				case '<': bufferFiltro.append("&lt;");break;
				case '>': bufferFiltro.append("&gt;");break;
				case '"': bufferFiltro.append("&quot;");break;
				case '&': bufferFiltro.append("&amp;");break;
				default: bufferFiltro.append(c);
			}
		}
		return bufferFiltro.toString();
	}
	
	public static boolean tieneCaracteresEspeciales(String cadenaEntrada) {
		boolean flag = false;
		if((cadenaEntrada != null) && (cadenaEntrada.length()>0)) {
			char c;
			for(int i=0; i<cadenaEntrada.length(); i++) {
				c = cadenaEntrada.charAt(i);
				switch (c) {
					case '<': flag = true; break;
					case '>': flag = true; break;
					case '"': flag = true; break;
					case '&': flag = true; break;
				}
			}
		}
		return flag;
	}

	public static String header() {
		String text = "<header>Header</header>";
		return text;
	}

	public static String nav() {
		String text = "<nav>Nav</nav>";
		return text;
	}

	public static String main(String texto) {
		String text = "<section>" + texto + "</section>";
		return text;
	}

	public static String aside() {
		String text = "<aside>Aside</aside>";
		return text;
	}

	public static String footer(String string) {
		String text = "<footer>" + string + "</footer>";
		return text;
	}

	public static String estilosCSS() {
		String text = "body{\n" + "    padding: 3%;\n" + "}\n" + "\n" + "\n" + "header {\n"
				+ "    background-color: rgb(235, 121, 76);\n" + "    height: 100px;\n" + "}\n" + "\n" + "nav {\n"
				+ "    background-color: rgb(231, 194, 69);\n" + "    display: inline-block;\n" + "    width: 27%;\n"
				+ "    height: 400px;\n" + "}\n" + "\n" + "section {\n" + "    background-color: red;\n"
				+ "    display: inline-block;\n" + "    width: 45.4%;\n" + "    height: 400px;\n" + "}\n" + "\n"
				+ "aside {\n" + "    background-color: rgb(78, 125, 196);\n" + "    display: inline-block;\n"
				+ "    width: 27%;\n" + "    height: 400px;\n" + "}\n" + "\n" + "footer {\n"
				+ "    background-color: rgb(83, 74, 206);\n" + "    height: 100px;\n" + "}\n" + "\n" + "\n" + "";
		return text;
	}

}
