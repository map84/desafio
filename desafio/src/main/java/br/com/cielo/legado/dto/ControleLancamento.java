package br.com.cielo.legado.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ControleLancamento implements Serializable {

	private static final long serialVersionUID = 1L;

	private LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", timezone="America/Sao_Paulo")
	private Date dataEfetivaLancamento;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", timezone="America/Sao_Paulo")
	private Date dataLancamentoContaCorrenteCliente;
	private String numeroEvento;
	private String descricaoGrupoPagamento;
	private String codigoIdentificadorUnico;
	private String nomeBanco;
	private int quantidadeLancamentoRemessa;
	private String numeroRaizCNPJ;
	private String numeroSufixoCNPJ;
	private BigDecimal valorLancamentoRemessa;
	private Long dateLancamentoContaCorrenteCliente;
	private Long dateEfetivaLancamento;
	
	/**
	 * @return the lancamentoContaCorrenteCliente
	 */
	public LancamentoContaCorrenteCliente getLancamentoContaCorrenteCliente() {
		return lancamentoContaCorrenteCliente;
	}
	/**
	 * @param lancamentoContaCorrenteCliente the lancamentoContaCorrenteCliente to set
	 */
	public void setLancamentoContaCorrenteCliente(LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente) {
		this.lancamentoContaCorrenteCliente = lancamentoContaCorrenteCliente;
	}
	/**
	 * @return the dataEfetivaLancamento
	 */
	public Date getDataEfetivaLancamento() {
		return dataEfetivaLancamento;
	}
	/**
	 * @param dataEfetivaLancamento the dataEfetivaLancamento to set
	 */
	public void setDataEfetivaLancamento(Date dataEfetivaLancamento) {
		this.dataEfetivaLancamento = dataEfetivaLancamento;
	}
	/**
	 * @return the dataLancamentoContaCorrenteCliente
	 */
	public Date getDataLancamentoContaCorrenteCliente() {
		return dataLancamentoContaCorrenteCliente;
	}
	/**
	 * @param dataLancamentoContaCorrenteCliente the dataLancamentoContaCorrenteCliente to set
	 */
	public void setDataLancamentoContaCorrenteCliente(Date dataLancamentoContaCorrenteCliente) {
		this.dataLancamentoContaCorrenteCliente = dataLancamentoContaCorrenteCliente;
	}
	/**
	 * @return the numeroEvento
	 */
	public String getNumeroEvento() {
		return numeroEvento;
	}
	/**
	 * @param numeroEvento the numeroEvento to set
	 */
	public void setNumeroEvento(String numeroEvento) {
		this.numeroEvento = numeroEvento;
	}
	/**
	 * @return the descricaoGrupoPagamento
	 */
	public String getDescricaoGrupoPagamento() {
		return descricaoGrupoPagamento;
	}
	/**
	 * @param descricaoGrupoPagamento the descricaoGrupoPagamento to set
	 */
	public void setDescricaoGrupoPagamento(String descricaoGrupoPagamento) {
		this.descricaoGrupoPagamento = descricaoGrupoPagamento;
	}
	/**
	 * @return the codigoIdentificadorUnico
	 */
	public String getCodigoIdentificadorUnico() {
		return codigoIdentificadorUnico;
	}
	/**
	 * @param codigoIdentificadorUnico the codigoIdentificadorUnico to set
	 */
	public void setCodigoIdentificadorUnico(String codigoIdentificadorUnico) {
		this.codigoIdentificadorUnico = codigoIdentificadorUnico;
	}
	/**
	 * @return the nomeBanco
	 */
	public String getNomeBanco() {
		return nomeBanco;
	}
	/**
	 * @param nomeBanco the nomeBanco to set
	 */
	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}
	/**
	 * @return the quantidadeLancamentoRemessa
	 */
	public int getQuantidadeLancamentoRemessa() {
		return quantidadeLancamentoRemessa;
	}
	/**
	 * @param quantidadeLancamentoRemessa the quantidadeLancamentoRemessa to set
	 */
	public void setQuantidadeLancamentoRemessa(int quantidadeLancamentoRemessa) {
		this.quantidadeLancamentoRemessa = quantidadeLancamentoRemessa;
	}
	/**
	 * @return the numeroRaizCNPJ
	 */
	public String getNumeroRaizCNPJ() {
		return numeroRaizCNPJ;
	}
	/**
	 * @param numeroRaizCNPJ the numeroRaizCNPJ to set
	 */
	public void setNumeroRaizCNPJ(String numeroRaizCNPJ) {
		this.numeroRaizCNPJ = numeroRaizCNPJ;
	}
	/**
	 * @return the numeroSufixoCNPJ
	 */
	public String getNumeroSufixoCNPJ() {
		return numeroSufixoCNPJ;
	}
	/**
	 * @param numeroSufixoCNPJ the numeroSufixoCNPJ to set
	 */
	public void setNumeroSufixoCNPJ(String numeroSufixoCNPJ) {
		this.numeroSufixoCNPJ = numeroSufixoCNPJ;
	}
	/**
	 * @return the valorLancamentoRemessa
	 */
	public BigDecimal getValorLancamentoRemessa() {
		return valorLancamentoRemessa;
	}
	/**
	 * @param valorLancamentoRemessa the valorLancamentoRemessa to set
	 */
	public void setValorLancamentoRemessa(BigDecimal valorLancamentoRemessa) {
		this.valorLancamentoRemessa = valorLancamentoRemessa;
	}
	/**
	 * @return the dateLancamentoContaCorrenteCliente
	 */
	public Long getDateLancamentoContaCorrenteCliente() {
		return dateLancamentoContaCorrenteCliente;
	}
	/**
	 * @param dateLancamentoContaCorrenteCliente the dateLancamentoContaCorrenteCliente to set
	 */
	public void setDateLancamentoContaCorrenteCliente(Long dateLancamentoContaCorrenteCliente) {
		this.dateLancamentoContaCorrenteCliente = dateLancamentoContaCorrenteCliente;
	}
	/**
	 * @return the dateEfetivaLancamento
	 */
	public Long getDateEfetivaLancamento() {
		return dateEfetivaLancamento;
	}
	/**
	 * @param dateEfetivaLancamento the dateEfetivaLancamento to set
	 */
	public void setDateEfetivaLancamento(Long dateEfetivaLancamento) {
		this.dateEfetivaLancamento = dateEfetivaLancamento;
	}
}
