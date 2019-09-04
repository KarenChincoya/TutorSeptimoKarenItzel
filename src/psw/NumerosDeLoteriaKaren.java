package psw;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NumerosDeLoteriaKIVC
 */
@WebServlet("/NumerosDeLoteriaKaren")
public class NumerosDeLoteriaKaren extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int[] numeros = new int[10];
	private String creadoPor;
	
	public void init() throws ServletException {
		
		ServletConfig sc = getServletConfig();
		String initParam = sc.getInitParameter("programador");
		creadoPor = initParam;
		
		for(int i=0; i<numeros.length; i++) {
			numeros[i] = getRandom();
		}
		
	}
	
	public int[] getNumeros() {
		return numeros;
	}

	public void setNumeros(int[] numeros) {
		this.numeros = numeros;
	}
	
	public int getRandom() {
		return (int) (Math.random()*100+1);
	}
	
	public String getListaNumeros() {
		String lista = "<ul>";
		for(int i=0; i<numeros.length; i++) {
			lista = lista.concat("<li>"+numeros[i]+"</li>");
		}
		lista = lista.concat("</ul>");
		return lista;
	}
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NumerosDeLoteriaKaren() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//numeros en lista HTML
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String titulo = "Servlet numeros de loterìa";
		
		out.println(PswUtilidades.encabezado(titulo)+
				//"<HTML>\n" + 
				//"<HEAD><TITLE>Servlet Utilidades </TITLE></HEAD>\n" +
				"<BODY>\n" +
					PswUtilidades.header() +
					PswUtilidades.nav() +
					PswUtilidades.main(getListaNumeros()) +
					PswUtilidades.aside() +
					PswUtilidades.footer("Creado por: "+creadoPor) +			
					"<style>"+
						PswUtilidades.estilosCSS() +
					"</style>" +
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
