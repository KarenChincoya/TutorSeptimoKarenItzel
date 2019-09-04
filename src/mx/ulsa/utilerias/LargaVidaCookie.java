package mx.ulsa.utilerias;

import javax.servlet.http.Cookie;

public class LargaVidaCookie extends Cookie {
	public static final Integer SECONDS_PER_YEAR = 60*60*24*365;
	
	public LargaVidaCookie(String name, String value) {
		super(name, value);
		setMaxAge(SECONDS_PER_YEAR);
	}

}
