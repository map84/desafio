package br.com.cielo.legado.dto;

import java.io.Serializable;

public class FilterLegado implements Serializable {

	private static final long serialVersionUID = 1L;

	private String numeroEvento;
	private String nomeSituacaoRemessa;
	private String nomeTipoOperacao;
	
	public FilterLegado(String numeroEvento, String nomeSituacaoRemessa, String nomeTipoOperacao) {
		super();
		this.numeroEvento = numeroEvento != null && !"".equalsIgnoreCase(numeroEvento) ? numeroEvento : null;
		this.nomeSituacaoRemessa = nomeSituacaoRemessa != null && !"".equalsIgnoreCase(nomeSituacaoRemessa) ? nomeSituacaoRemessa : null;
		this.nomeTipoOperacao = nomeTipoOperacao != null && !"".equalsIgnoreCase(nomeTipoOperacao) ? nomeTipoOperacao : null;;
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
	 * @return the nomeSituacaoRemessa
	 */
	public String getNomeSituacaoRemessa() {
		return nomeSituacaoRemessa;
	}
	/**
	 * @param nomeSituacaoRemessa the nomeSituacaoRemessa to set
	 */
	public void setNomeSituacaoRemessa(String nomeSituacaoRemessa) {
		this.nomeSituacaoRemessa = nomeSituacaoRemessa;
	}
	/**
	 * @return the nomeTipoOperacao
	 */
	public String getNomeTipoOperacao() {
		return nomeTipoOperacao;
	}
	/**
	 * @param nomeTipoOperacao the nomeTipoOperacao to set
	 */
	public void setNomeTipoOperacao(String nomeTipoOperacao) {
		this.nomeTipoOperacao = nomeTipoOperacao;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomeSituacaoRemessa == null) ? 0 : nomeSituacaoRemessa.hashCode());
		result = prime * result + ((nomeTipoOperacao == null) ? 0 : nomeTipoOperacao.hashCode());
		result = prime * result + ((numeroEvento == null) ? 0 : numeroEvento.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FilterLegado other = (FilterLegado) obj;
		if (nomeSituacaoRemessa == null) {
			if (other.nomeSituacaoRemessa != null)
				return false;
		} else if (!nomeSituacaoRemessa.equals(other.nomeSituacaoRemessa))
			return false;
		if (nomeTipoOperacao == null) {
			if (other.nomeTipoOperacao != null)
				return false;
		} else if (!nomeTipoOperacao.equals(other.nomeTipoOperacao))
			return false;
		if (numeroEvento == null) {
			if (other.numeroEvento != null)
				return false;
		} else if (!numeroEvento.equals(other.numeroEvento))
			return false;
		return true;
	}
}
