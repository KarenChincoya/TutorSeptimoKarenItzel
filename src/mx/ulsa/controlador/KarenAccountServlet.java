package mx.ulsa.controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Hashtable;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import psw.PswUtilidades;

/**
 * Servlet implementation class KarenAccountServlet
 */
@WebServlet("/KarenAccountServlet")
public class KarenAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Hashtable data = new Hashtable();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public KarenAccountServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void init() {
		data.put("ann", new String[] { "01/01/2002: 1000.0", "01/02/2002: 1300.0", "01/03/2002: 900.0" });
		data.put("john", new String[] { "01/01/2002: 4500.0", "01/02/2002: 2100.0", "01/03/2002: 2600.0" });
		data.put("mark", new String[] { "01/01/2002: 7800.0", "01/02/2002: 5200.0", "01/03/2002: 1900.0" });
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userid = (String) request.getAttribute("userid");
		if (userid != null) {
			String[] records = (String[]) data.get(userid);
			PrintWriter pw = response.getWriter();
			pw.print(PswUtilidades.encabezado("account servlet") + "<body>" + "<h3>Account status for " + userid
					+ " at the start of previous three months...</h3>");
			for (int i = 0; i < records.length; i++) {
				pw.println(records[i] + "<br>");
			}
			pw.println("</body>");
			pw.println("</html>");
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("../../../WebContent/KarenLogin.html");
			rd.forward(request, response);
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
