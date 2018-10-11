package br.com.cielo.mapper;

import org.springframework.stereotype.Component;

import br.com.cielo.dto.LaunchResponse;
import br.com.cielo.legado.dto.LancamentoContaLegado;
import ma.glasnost.orika.MapperFactory;
import net.rakugakibox.spring.boot.orika.OrikaMapperFactoryConfigurer;

@Component
public class LaunchResponseMapper implements OrikaMapperFactoryConfigurer {

	@Override
	public void configure(MapperFactory orikaMapperFactory) {
		orikaMapperFactory.classMap(LaunchResponse.class, LancamentoContaLegado.class)
        .field("summary.totalElements", "totalElements")
        .field("summary.pageSize", "tamanhoPagina")
        .field("summary.firstRegister", "indice")
        .field("items{id}", "listaControleLancamento{numeroEvento}")
        .field("items{effectiveDate}", "listaControleLancamento{dataEfetivaLancamento}")
        .field("items{status}", "listaControleLancamento{lancamentoContaCorrenteCliente.nomeSituacaoRemessa}")
        .field("items{confirmDate}", "listaControleLancamento{dataLancamentoContaCorrenteCliente}")
        .field("items{description}", "listaControleLancamento{lancamentoContaCorrenteCliente.nomeTipoOperacao}")
        .field("items{amount}", "listaControleLancamento{valorLancamentoRemessa}")
        .field("items{bank.agency}", "listaControleLancamento{lancamentoContaCorrenteCliente.dadosDomicilioBancario.numeroAgencia}")
        .field("items{bank.account}", "listaControleLancamento{lancamentoContaCorrenteCliente.dadosDomicilioBancario.numeroContaCorrente}")
        .field("items{bank.name}", "listaControleLancamento{nomeBanco}")
        .byDefault()
        .register();
	}
}