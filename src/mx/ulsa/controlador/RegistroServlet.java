package mx.ulsa.controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.ulsa.utilerias.LargaVidaCookie;
import psw.PswUtilidades;

/**
 * Servlet implementation class RegistroServlet
 */
@WebServlet("/RegistroServlet")
public class RegistroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistroServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		evaluarGet(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	/**
	 * Determina si el valor es nulo o vacio
	 */
	
	private boolean isMissing(String param) {
		return ((param==null) || (param.trim().equals("")));
	}
	
	/**
	 * funcion para evaluar 
	 */
	
	public void evaluarGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		boolean isMissingValue = false;
		String nombre = request.getParameter("nombre");
		if(isMissing(nombre)) {
			nombre = "Nombre";
			isMissingValue = true;
		}
		String apellido = request.getParameter("apellido");
		if(isMissing(apellido)) {
			nombre = "Apellido";
			isMissingValue = true;
		}
		String email = request.getParameter("email");
		if(isMissing(email)) {
			nombre = "email@abc.com";
			isMissingValue = true;
		}
		
		Cookie c1 = new LargaVidaCookie("nombre", nombre);
		response.addCookie(c1);
		System.out.println("nombre: "+nombre);
		
		Cookie c2 = new LargaVidaCookie("apellido", nombre);
		response.addCookie(c2);
		System.out.println("apellido: "+apellido);
		
		Cookie c3 = new LargaVidaCookie("email", email);
		response.addCookie(c3);
		System.out.println("email: "+email);
		
		String servletFormulario = request.getContextPath()+"/FormularioDeRegistroServlet";
		
		if(isMissingValue) {
			response.sendRedirect(servletFormulario);
		}else {
			PrintWriter out = response.getWriter();
			
			String title = "Registro completado!";
			
			out.println(PswUtilidades.encabezado(title)
					+ "<body align=\"center\" bgcolor=\"#ECF6CE\">"
					+ "<H1>"
					+ title
					+ "</H1>"
					+ "<ul>"
					+ "<li> Nombre: "
					+ nombre
					+ "</li>"
					+ "<li> Apellido: "
					+ apellido
					+ "</li>"
					+ "<li> Email: "
					+ email
					+ "</li>"
					+ "</ul>"
					+ "</body></html>");
		}
		
	}
	
	protected void getAllParameters(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				//valor esta olvidado isMissing() == false
				Enumeration<String> parametros = request.getParameterNames();

				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				String titulo = "Servlet Utilidades";
				String title = "Leer todos los parametros en Request";

				out.println(PswUtilidades.encabezado(titulo) + "<BODY bgcolor=\"#FDF5E6\">\n"
						+ "<h1 align=\"center\">"+ title + "</h1>\n"  
						+ "<table border=1 align=center>\n" 
						+ "<tr bgcolor=\"#FFAD00\">\n"
						+ "<th>Nombre del parametro</th><th>Valor de los parametros</th></tr>");

				
				Enumeration nombresParametros = request.getParameterNames();
				while(nombresParametros.hasMoreElements()) {
					String nombreDelParametro = (String) nombresParametros.nextElement();
					out.print("<tr><td>"+nombreDelParametro+"\n<td>");
					String[] valoresParametros = request.getParameterValues(nombreDelParametro);
					if(valoresParametros.length==1) {
						String paramValue = valoresParametros[0];
						if(paramValue.length()==0) {
							out.println("<i>No hay valor</i>");
						}else {
							out.println(paramValue);
						}
					}else {
						out.println("<ul>");
						for(int i=0; i<valoresParametros.length; i++) {
							out.println("<li>"+valoresParametros[i]+"</li>");
						}
						out.println("</ul>");
					}
					out.println("</tr>");
				}
				out.println("</table>");
				
				out.println("<BODY></HTML>");
	}

}
