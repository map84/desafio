package br.com.cielo.json.test;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.cielo.exception.LegadoException;
import br.com.cielo.legado.JsonUtils;
import br.com.cielo.legado.dto.LancamentoContaLegado;

/**
 * @author Marcos Alves
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class JsonTest {

	@Test
	public void testConvertJson() throws LegadoException {

		LancamentoContaLegado response = (LancamentoContaLegado) JsonUtils.convertJsonToObject(JsonUtils.FILE,
				LancamentoContaLegado.class);

		assertEquals(39, response.getTotalElements());
		assertEquals(1, response.getIndice());
		assertEquals(25, response.getTamanhoPagina());
		assertEquals(608, response.getTotalControleLancamento().getQuantidadeLancamentos());
		assertEquals(39, response.getTotalControleLancamento().getQuantidadeRemessas());
		assertEquals(new BigDecimal("473320.37"), response.getTotalControleLancamento().getValorLancamentos());
	}
}
