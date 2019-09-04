package psw;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		String user = request.getParameter("user");
		String password = request.getParameter("password");
		
		String user0 = "karen";
		String password0 = "1234";
		System.out.println(password);
		
		String resultado = "";
		
		if(user.equals(user0) && password.equals(password0)) {
			resultado = "Bienvenido usuario:"+user;
		}else {
			resultado = "Usuario incorrecto:"+user;
		}
		PrintWriter out = response.getWriter();
		out.println(PswUtilidades.encabezado("Login")+
				//"<HTML>\n" + 
				//"<HEAD><TITLE>Servlet Utilidades </TITLE></HEAD>\n" +
				"<BODY>\n" +
				resultado+
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
