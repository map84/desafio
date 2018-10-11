package br.com.cielo.legado.service;

import br.com.cielo.exception.LegadoException;
import br.com.cielo.legado.dto.FilterLegado;
import br.com.cielo.legado.dto.LancamentoContaLegado;

public interface LegadoService {

	LancamentoContaLegado findAccountLaunch(FilterLegado filter) throws LegadoException;
}
