package psw;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TodosParametros
 */
@WebServlet("/servlet/TodosParametros")
public class TodosParametros extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TodosParametros() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		
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
