package mx.ulsa.utilerias;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieUtilities {

	/**
	 * Dado el objeto request, un nombre y un valor predeterminado, este mètodo
	 * intenta encontrar el valor de la cookie con el nombre dato. Si ninguna
	 * cookie coincide con el nombre, se devuelve el valor predeterminado
	 * 
	 * @param request
	 * @param response
	 * @param cookieNombre
	 * @param defaultValor
	 * @return 
	 */
	
	public static String getCookieValor(HttpServletRequest request, String cookieNombre, String defaultValor) {
		Cookie[] cookies = request.getCookies();
		if(cookies != null) {
			for(int i=0; i<cookies.length; i++) {
				Cookie cookie = cookies[i];
				if(cookieNombre.equals(cookie.getName())) {
					return cookie.getValue();
				}
			}
		}
		return (defaultValor);
	}
	
	/**
	 * Dado el objeto request y un nombre, este mètodo intenta encontrar y
	 * devolver la cookie que tiene el nombre dado. Si ninunca cookie coincide
	 * con el nombre, de devuelve null
	 * 
	 * @param request
	 * @param cookieNombre
	 * @return
	 */
	
	public static Cookie getCookie(HttpServletRequest request, String cookieNombre) {
		Cookie[] cookies = request.getCookies();
		if(cookies != null) {
			for(int i=0; i<cookies.length; i++) {
				Cookie cookie = cookies[i];
				if(cookie.equals(cookie.getName())) {
					return (cookie);
				}
			}
		}
		return (null);
	}
	
}
