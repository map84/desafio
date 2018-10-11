package br.com.cielo.service;

import br.com.cielo.dto.LaunchResponse;
import br.com.cielo.exception.AccountException;
import br.com.cielo.exception.LegadoException;
import br.com.cielo.legado.dto.FilterLegado;

public interface AccountService {

	LaunchResponse find(FilterLegado filter) throws AccountException, LegadoException;
}
