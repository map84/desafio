package br.com.cielo.legado.service.impl;

import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import br.com.cielo.exception.LegadoException;
import br.com.cielo.legado.JsonUtils;
import br.com.cielo.legado.dto.FilterLegado;
import br.com.cielo.legado.dto.LancamentoContaLegado;
import br.com.cielo.legado.service.LegadoService;

/**
 * 
 * @author Marcos Alves
 *
 */
@Service
public class LegadoServiceImpl implements LegadoService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(LegadoServiceImpl.class);

	@Override
	public LancamentoContaLegado findAccountLaunch(FilterLegado filter) throws LegadoException {
		
		LOGGER.debug("findAccountLaunch - INICIO");
		
		LancamentoContaLegado response = (LancamentoContaLegado) JsonUtils.convertJsonToObject(JsonUtils.FILE,
				LancamentoContaLegado.class);
		
		int total = response.getListaControleLancamento().size();
		
		if(filter.getNumeroEvento() != null) {
		
			response.setListaControleLancamento(response.getListaControleLancamento().stream()
					.filter(controleLancamento -> filter.getNumeroEvento().equalsIgnoreCase(controleLancamento.getNumeroEvento()))
					.collect(Collectors.toList()));
		}
		
		if(filter.getNomeSituacaoRemessa() != null) {
		
			response.setListaControleLancamento(response.getListaControleLancamento().stream()
				.filter(controleLancamento -> filter.getNomeSituacaoRemessa().equalsIgnoreCase(
						controleLancamento.getLancamentoContaCorrenteCliente().getNomeSituacaoRemessa()))
				.collect(Collectors.toList()));
		}
		
		if(filter.getNomeTipoOperacao() != null) {
		
			response.setListaControleLancamento(response.getListaControleLancamento().stream()
				.filter(controleLancamento -> filter.getNomeTipoOperacao().equalsIgnoreCase(
						controleLancamento.getLancamentoContaCorrenteCliente().getNomeTipoOperacao()))
				.collect(Collectors.toList()));
		} 
	
		response.setTotalElements(total != response.getListaControleLancamento().size() ? 
				response.getTotalElements() - (total - response.getTotalElements()) : response.getTotalElements());
		
		LOGGER.debug("findAccountLaunch - FIM");
		
		return response;
	}
}
