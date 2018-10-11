package br.com.cielo.legado.dto;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @author Marcos Alves
 *
 */
public class LancamentoContaLegado implements Serializable {

	private static final long serialVersionUID = 1L;

	private TotalControleLancamento totalControleLancamento;
	private List<ControleLancamento> listaControleLancamento;
	private int indice;
	private int tamanhoPagina;
	private int totalElements;
	
	/**
	 * @return the totalControleLancamento
	 */
	public TotalControleLancamento getTotalControleLancamento() {
		return totalControleLancamento;
	}
	/**
	 * @param totalControleLancamento the totalControleLancamento to set
	 */
	public void setTotalControleLancamento(TotalControleLancamento totalControleLancamento) {
		this.totalControleLancamento = totalControleLancamento;
	}
	/**
	 * @return the listaControleLancamento
	 */
	public List<ControleLancamento> getListaControleLancamento() {
		return listaControleLancamento;
	}
	/**
	 * @param listaControleLancamento the listaControleLancamento to set
	 */
	public void setListaControleLancamento(List<ControleLancamento> listaControleLancamento) {
		this.listaControleLancamento = listaControleLancamento;
	}
	/**
	 * @return the indice
	 */
	public int getIndice() {
		return indice;
	}
	/**
	 * @param indice the indice to set
	 */
	public void setIndice(int indice) {
		this.indice = indice;
	}
	/**
	 * @return the tamanhoPagina
	 */
	public int getTamanhoPagina() {
		return tamanhoPagina;
	}
	/**
	 * @param tamanhoPagina the tamanhoPagina to set
	 */
	public void setTamanhoPagina(int tamanhoPagina) {
		this.tamanhoPagina = tamanhoPagina;
	}
	/**
	 * @return the totalElements
	 */
	public int getTotalElements() {
		return totalElements;
	}
	/**
	 * @param totalElements the totalElements to set
	 */
	public void setTotalElements(int totalElements) {
		this.totalElements = totalElements;
	}
}
