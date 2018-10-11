package br.com.cielo.legado;

import java.io.InputStream;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.cielo.exception.LegadoException;

/**
 * 
 * @author Marcos Alves
 *
 */
public class JsonUtils {
	
	public static final String FILE = "lancamento-conta-legado.json";
	
	public static String convertObjectToJson(final Object obj) throws LegadoException {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new LegadoException(e);
        }
    }
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static Object convertJsonToObject(final String path, final Class classes) throws LegadoException {
		try {
			ClassLoader classloader = Thread.currentThread().getContextClassLoader();
			InputStream is = classloader.getResourceAsStream(path);
			return new ObjectMapper().readValue(is, classes);
		} catch (Exception e) {
            throw new LegadoException(e);
        }
	}
}