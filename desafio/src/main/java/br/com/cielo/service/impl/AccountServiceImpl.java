package br.com.cielo.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cielo.dto.LaunchResponse;
import br.com.cielo.exception.AccountException;
import br.com.cielo.exception.LegadoException;
import br.com.cielo.legado.dto.FilterLegado;
import br.com.cielo.legado.dto.LancamentoContaLegado;
import br.com.cielo.legado.service.LegadoService;
import br.com.cielo.service.AccountService;
import ma.glasnost.orika.MapperFacade;

/**
 * 
 * @author Marcos Alves
 *
 */
@Service
public class AccountServiceImpl implements AccountService {

	private static final Logger LOGGER = LoggerFactory.getLogger(AccountServiceImpl.class);
	
	@Autowired
	private MapperFacade orikaMapperFacade;
	
	@Autowired
	private LegadoService legadoService;
	
	
	public LaunchResponse find(FilterLegado filter) throws AccountException, LegadoException {
	
		LOGGER.debug("findById - INICIO");
		
		LancamentoContaLegado legado = legadoService.findAccountLaunch(filter);
		LaunchResponse response = orikaMapperFacade.map(legado, LaunchResponse.class);
		
		LOGGER.debug("findById - FIM");
		
		return response;
	}
}
