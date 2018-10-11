package br.com.cielo.mapper.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import br.com.cielo.dto.LaunchResponse;
import br.com.cielo.exception.LegadoException;
import br.com.cielo.legado.JsonUtils;
import br.com.cielo.legado.dto.LancamentoContaLegado;
import ma.glasnost.orika.MapperFacade;

/**
 * @author Marcos Alves
 *
 */
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application-context.xml")
public class MapperTest {

	@Autowired
	private MapperFacade orikaMapperFacade;
 
    @Test
    public void testMapper() throws LegadoException {
    	
    	LancamentoContaLegado response = (LancamentoContaLegado) JsonUtils.convertJsonToObject(JsonUtils.FILE,
				LancamentoContaLegado.class);
    	
    	LaunchResponse dto = orikaMapperFacade.map(response, LaunchResponse.class);
    	assertEquals(response.getIndice(), dto.getSummary().getFirstRegister().intValue());
    	assertEquals(response.getTamanhoPagina(), dto.getSummary().getPageSize().intValue());
    	assertEquals(response.getTotalElements(), dto.getSummary().getTotalElements().intValue());
    }
}
