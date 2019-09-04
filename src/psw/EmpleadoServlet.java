package psw;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmpleadoServlet
 */
@WebServlet("/servlet/EmpleadoServlet")
public class EmpleadoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpleadoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		EmpleadoInformacion info = new EmpleadoInformacion();
		BeanUtilidades.poblarBean(info, request);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String title = "Información "+info.getName();
		out.print(PswUtilidades.encabezado(title)
				+ "<ul>"
				+"<li>Empleado ID: "
				+ info.getEmployeeID() +"</li>"
				+"<li>Número de hijos: "
				+info.getNumChildren() +"</li>"
				+"<li>Casado?: "
				+ info.isMarried()+"</li>"
				+"</ul>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
