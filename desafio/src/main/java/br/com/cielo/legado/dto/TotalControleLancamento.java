package br.com.cielo.legado.dto;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 
 * @author Marcos Alves
 *
 */
public class TotalControleLancamento implements Serializable {

	private static final long serialVersionUID = 1L;

	private int quantidadeLancamentos;
	private int quantidadeRemessas;
	private BigDecimal valorLancamentos;
	
	/**
	 * @return the quantidadeLancamentos
	 */
	public int getQuantidadeLancamentos() {
		return quantidadeLancamentos;
	}
	/**
	 * @param quantidadeLancamentos the quantidadeLancamentos to set
	 */
	public void setQuantidadeLancamentos(int quantidadeLancamentos) {
		this.quantidadeLancamentos = quantidadeLancamentos;
	}
	/**
	 * @return the quantidadeRemessas
	 */
	public int getQuantidadeRemessas() {
		return quantidadeRemessas;
	}
	/**
	 * @param quantidadeRemessas the quantidadeRemessas to set
	 */
	public void setQuantidadeRemessas(int quantidadeRemessas) {
		this.quantidadeRemessas = quantidadeRemessas;
	}
	/**
	 * @return the valorLancamentos
	 */
	public BigDecimal getValorLancamentos() {
		return valorLancamentos;
	}
	/**
	 * @param valorLancamentos the valorLancamentos to set
	 */
	public void setValorLancamentos(BigDecimal valorLancamentos) {
		this.valorLancamentos = valorLancamentos;
	}
}
