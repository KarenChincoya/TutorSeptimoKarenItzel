package mx.ulsa.controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import psw.PswUtilidades;

/**
 * Servlet implementation class KarenEjercicio1Servlet
 */
@WebServlet("/servlet/KarenEjercicio1Servlet")
public class KarenEjercicio1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public KarenEjercicio1Servlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		try {
			// TODO Auto-generated method stub
			String searchString = request.getParameter("searchString");
			String[] stateList = request.getParameterValues("state");
			
			//Use this values to generate a response
			response.setContentType("text/html");
			
			String titulo = "Servlet KarenEjercicio1";
			String title = "Karen Ejercicio 1";

			out.println(PswUtilidades.encabezado(titulo) + "<BODY bgcolor=\"#FDF5E6\">\n"
					+ "<h1 align=\"center\">"+ title + "</h1>\n");
			
			out.println("<h2>Search string value:</h2>"
					+"<ul><li>"+searchString +"</li></ul>"
					+"<h2>State list value:</h2>"
					+"<ul>"
					);
			for(int i=0; i<stateList.length; i++) {
				out.println("<li>"+stateList[i]+"</li>");
			}
			out.println("</ul>");
			
			out.println("<BODY></HTML>");
		}catch (Exception e) {
			// TODO: handle exception
			out.println("Hubo un error.");
		}
		
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
