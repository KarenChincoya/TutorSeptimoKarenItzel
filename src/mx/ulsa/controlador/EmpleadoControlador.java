package mx.ulsa.controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.ulsa.modelo.EmpleadoModelo;
import mx.ulsa.servicio.EmpleadoServicio;
import psw.PswUtilidades;

/**
 * Servlet implementation class EmpleadoControlador
 */
@WebServlet("/servlet/EmpleadoControlador")
public class EmpleadoControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EmpleadoControlador() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		/* Almacena en el modelo lo que es recuperado de la vista*/
		EmpleadoModelo em = new EmpleadoModelo(
		request.getParameter("nombre"),
		Integer.parseInt(request.getParameter("id")),
		Boolean.parseBoolean(request.getParameter("activo")));
		
		/* Guardar el modelo por medio del servicio */
		String guardado = "Registro guardado con éxito.";
		if(EmpleadoServicio.guardar(em)!=0) {
			guardado = "error";
		}
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String title = "Arquitectura 3 capas";
		out.print(PswUtilidades.encabezado(title)
				+"<BODY>"
				+"<H1>Resultado</H1>" 
				+guardado
				+"</BODY></HTML>");
		
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
