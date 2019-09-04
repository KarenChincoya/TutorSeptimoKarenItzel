package mx.ulsa.modelo;

import java.util.HashMap;
import java.util.Map;

public class KarenUsers {

	private static Map<String, String> users;
	
	public KarenUsers() {
		users = new HashMap<String, String>();
		users.put("1", "uno");
		users.put("2", "dos");
		users.put("3", "tres");
		users.put("4", "cuatro");
		users.put("5", "cinco");
	}
	
	public String get(String userid) {
		String r = this.users.get(userid);
		return r;
	}
}
