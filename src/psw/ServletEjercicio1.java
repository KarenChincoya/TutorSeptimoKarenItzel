package psw;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletEjercicio1
 */
@WebServlet("/ServletEjercicio1")
public class ServletEjercicio1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletEjercicio1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String titulo = "Servlet Utilidades";
		
		out.println(PswUtilidades.encabezado(titulo)+
				//"<HTML>\n" + 
				//"<HEAD><TITLE>Servlet Utilidades </TITLE></HEAD>\n" +
				"<BODY>\n" +
				"<style>"+
					PswUtilidades.estilosCSS() +
				"</style>" +
					PswUtilidades.header() +
					PswUtilidades.nav() +
					PswUtilidades.main("Main") +
					PswUtilidades.aside() +
					PswUtilidades.footer("Footer") +			
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
