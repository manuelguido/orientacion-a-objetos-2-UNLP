package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Jackson {

	public String exportarJson(List<Socio> socios) throws JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(socios);
	}

}
