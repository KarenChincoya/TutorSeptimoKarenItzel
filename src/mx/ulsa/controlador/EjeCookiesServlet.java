package mx.ulsa.controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.ulsa.utilerias.CookieUtilities;
import mx.ulsa.utilerias.LargaVidaCookie;
import psw.PswUtilidades;

/**
 * Servlet implementation class EjeCookiesServlet
 */
@WebServlet("/EjeCookiesServlet")
public class EjeCookiesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public static void cookiesSessionVsCookiesPersistencia(HttpServletRequest request, HttpServletResponse response) throws IOException {

		for (int i = 0; i < 3; i++) {
			/**
			 * El valor predeterminado de maxAge es -1, lo que indica que la cookie solo se
			 * aplica a la sesiòn de navegaciòn actual
			 */
			Cookie cookie = new Cookie("Session-Cookie-" + i, "Cookie-Value-S" + i);
			response.addCookie(cookie);
			cookie = new Cookie("Persistent-Cookie-" + i, "Cookie-Value-P" + i);
			/**
			 * La cookie es valida durante una hora, independientemente de si el usuario
			 * cierra el navegador reinicia la computadora o lo que sea
			 */
			cookie.setMaxAge(10);
			response.addCookie(cookie);
		}
		response.setContentType("text/html");
		String title = "Cookies Activas";
		PrintWriter out = response.getWriter();
		out.println(PswUtilidades.encabezado("Cookies") + "<body bgcolor=\"#ECF6CE\">" + "<h1 align=\"center\">" + title
				+ "</h1> <table border=1 align=\"center\">" + "<tr bgcolor=\"#00FF40\">"
				+ "<th>Nombre cookie</th><th>Valor cookie</th>" + "</tr>");
		Cookie[] cookies = request.getCookies();
		if (cookies == null) {
			out.println("<tr><th colspan=2>No hay cokies</th></tr>");
		} else {
			for (Cookie cookie : cookies) {
				out.println("<tr>" + "<td>" + cookie.getName() + "</td>" + "<td>" + cookie.getValue() + "</td>");
			}
		}
		out.println("</table></body></html>");

	}

	public static void repetirVisitador(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub

		boolean esNuevo = true;
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (int i = 0; i < cookies.length; i++) {
				Cookie c = cookies[i];
				if ((c.getName().equals("repetirVisitador")) && (c.getValue().equals("yes"))) {
					esNuevo = false;
					break;
				}
			}
		}
		String title;
		if (esNuevo) {
			Cookie regresaCookieVisitador = new Cookie("repetirVisitador", "yes");
			regresaCookieVisitador.setMaxAge(10); // 1 anio: tiempo de expiracion de la cookie
			response.addCookie(regresaCookieVisitador);
			title = "Saludos visitador";
		} else {
			title = "Saludos nuevamente";
		}
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println(PswUtilidades.encabezado(title) + "<body>" + "<h1 align=\"center\">" + title + "</h1>"
				+ "</body></html>");

	}
	
	/**
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	
	private void contadorAccesosCliente(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String countString = CookieUtilities.getCookieValor(request, "contadorDeAccesos", "1");
		int count = 1;
		try {
			count = Integer.parseInt(countString);
		} catch(NumberFormatException nfe) {
			
		}
		
		LargaVidaCookie c = new LargaVidaCookie("contadorDeAccesos", String.valueOf(count+1));
		response.addCookie(c);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String title = "Servlet Contador de Accesos";
		out.println(PswUtilidades.encabezado(title)
				+ "<body>"
				+ "<center>"
				+ "<h1>"
				+ title
				+ "</h1>"
				+ "<h2>"
				+ "Es el número de visita " + count + " para este navegador"
				+ "</h2>"			
				+ "</center> </body></html>");
	}
	

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EjeCookiesServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// repetirVisitador(request, response);
		//cookiesSessionVsCookiesPersistencia(request, response);
		contadorAccesosCliente(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
