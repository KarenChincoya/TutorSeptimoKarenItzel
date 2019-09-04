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
import psw.PswUtilidades;

/**
 * Servlet implementation class FormularioDeRegistroServlet
 */
@WebServlet("/FormularioDeRegistroServlet")
public class FormularioDeRegistroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormularioDeRegistroServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Funcion
		function1(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	protected void function1(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String actionURL = request.getContextPath() + "/RegistroServlet";
		
		String nombre = CookieUtilities.getCookieValor(request, "nombre","");
		String apellido = CookieUtilities.getCookieValor(request, "apellido","");
		String email = CookieUtilities.getCookieValor(request, "email","");
		
		String title = "Registro";
		
		out.println(
				PswUtilidades.encabezado(title)
				+ "<body>"
				+ "<h1>"+title+"</h1>"
				+ "<form action=\""+actionURL+"\">"
				+ "Nombre: "+"<input type=\"text\" value=\"nombre\">"
				+ "Apellido: "+"<input type=\"text\" value=\"apellido\">"
				+ "Email: "+"<input type=\"text\" value=\"email\">"
				+"<input type=\"submit\" value=\"Registrar\">"
				+ "</form>"
				+ "</body></html>");
		
	}

}
