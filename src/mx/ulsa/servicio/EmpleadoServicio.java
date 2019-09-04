package mx.ulsa.servicio;

import mx.ulsa.modelo.EmpleadoModelo;
import mx.ulsa.persistencia.jdbc.EmpleadoDAO;

public class EmpleadoServicio {
	
	public static int guardar(EmpleadoModelo em) {
		
		/* Consulta un web service y agrègalo al modelo antes de guardar en bd */
	
		/* Convierte las fechas a cadena */
		
		return EmpleadoDAO.guardar(em);
		
	}
}
