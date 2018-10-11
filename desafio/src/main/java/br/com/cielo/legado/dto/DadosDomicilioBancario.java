package br.com.cielo.legado.dto;

import java.io.Serializable;

/**
 * 
 * @author Marcos Alves
 *
 */
public class DadosDomicilioBancario implements Serializable {

	private static final long serialVersionUID = 1L;

	private int codigoBanco;
	private int numeroAgencia;
	private String numeroContaCorrente;
	
	/**
	 * @return the codigoBanco
	 */
	public int getCodigoBanco() {
		return codigoBanco;
	}
	/**
	 * @param codigoBanco the codigoBanco to set
	 */
	public void setCodigoBanco(int codigoBanco) {
		this.codigoBanco = codigoBanco;
	}
	/**
	 * @return the numeroAgencia
	 */
	public int getNumeroAgencia() {
		return numeroAgencia;
	}
	/**
	 * @param numeroAgencia the numeroAgencia to set
	 */
	public void setNumeroAgencia(int numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}
	/**
	 * @return the numeroContaCorrente
	 */
	public String getNumeroContaCorrente() {
		return numeroContaCorrente;
	}
	/**
	 * @param numeroContaCorrente the numeroContaCorrente to set
	 */
	public void setNumeroContaCorrente(String numeroContaCorrente) {
		this.numeroContaCorrente = numeroContaCorrente;
	}
}
