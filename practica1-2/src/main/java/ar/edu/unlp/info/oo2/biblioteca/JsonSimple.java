package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
//import org.json.simple.JSONValue;

public class JsonSimple {

	@SuppressWarnings("unchecked")
	public String exportarJson(List<Socio> socios) {
		JSONArray arraySocios = new JSONArray();
        for (Socio socioString: socios) {
        	JSONObject socioObject = new JSONObject();
        	socioObject.put("Nombre", socioString.getNombre());
        	socioObject.put("Email", socioString.getEmail());
        	socioObject.put("Legajo", socioString.getLegajo());
        	arraySocios.add(socioObject);
        }
		return arraySocios.toJSONString();
	}
} 
