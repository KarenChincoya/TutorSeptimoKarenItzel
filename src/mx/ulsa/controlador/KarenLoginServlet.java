package mx.ulsa.controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Hashtable;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.ulsa.modelo.KarenUsers;

/**
 * Servlet implementation class KarenLoginServlet
 */
@WebServlet("/KarenLoginServlet")
public class KarenLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Hashtable<String, String> users = new Hashtable<String, String>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public KarenLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void init() {
		users.put("ann", "aaa");
		users.put("john", "jjj");
		users.put("mark","mmm");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*
		PrintWriter out = response.getWriter();
		out.println("Respuestaa");
		*/
		String userid = request.getParameter("userid");
		String password = request.getParameter("password");
		
		if(userid!=null && password!=null 
				&& password.equals(users.get(userid))) {
			request.setAttribute("userid", userid);
			
			ServletContext ct = getServletContext();
			RequestDispatcher rd = ct.getRequestDispatcher("/KarenAccountServlet");
			rd.forward(request, response);
			return;
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("KarenLogin.html");
			rd.forward(request, response);
			return;
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
