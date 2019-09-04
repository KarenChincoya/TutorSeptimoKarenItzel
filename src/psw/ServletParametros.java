package psw;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletParametros
 */
@WebServlet("/servlet/ServletParametros")
public class ServletParametros extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletParametros() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String parametro1 = request.getParameter("parametro1");
		String parametro2 = request.getParameter("parametro2");
		String parametro3 = request.getParameter("parametro3");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String titulo = "Servlet Utilidades";
		
		out.println(PswUtilidades.encabezado(titulo)+
				//"<HTML>\n" + 
				//"<HEAD><TITLE>Servlet Utilidades </TITLE></HEAD>\n" +
				"<BODY>\n" +
				"<ul>"+
				"<li><b>Parametro 1</b>: "+ parametro1 + "</li>" +
				"<li><b>Parametro 2</b>: "+ parametro2 + "</li>" +
				"<li><b>Parametro 3</b>: "+ parametro3 + "</li>" +
				
				"</ul>" +
				"<BODY></HTML>"
				);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
