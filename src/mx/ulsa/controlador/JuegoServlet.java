package mx.ulsa.controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JuegoServlet
 */
@WebServlet("/JuegoServlet")
public class JuegoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JuegoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1st: get Parameters
		
		Integer m0 = Integer.valueOf(request.getParameter("0"));
		Integer m1 = Integer.valueOf(request.getParameter("1"));
		Integer m2 = Integer.valueOf(request.getParameter("2"));
		Integer m3 = Integer.valueOf(request.getParameter("3"));
		Integer m4 = Integer.valueOf(request.getParameter("4"));
		Integer m5 = Integer.valueOf(request.getParameter("5"));
		Integer m6 = Integer.valueOf(request.getParameter("6"));
		Integer m7 = Integer.valueOf(request.getParameter("7"));
		Integer m8 = Integer.valueOf(request.getParameter("8"));
		
		Integer[] r0 = { m0, m1, m2 };
		Integer[] r1 = { m3, m4, m5 };
		Integer[] r2 = { m6, m7, m8 };
		
		Integer[][] matriz = {r0, r1, r2};
		
		Cuadro cuadro = new Cuadro(3, matriz);
		ResultadoMatriz resultado = cuadro.isMagico();
		
		PrintWriter out = response.getWriter();
		out.println(resultado);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
