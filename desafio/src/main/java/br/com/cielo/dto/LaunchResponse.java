package br.com.cielo.dto;

import java.io.Serializable;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 * @author Marcos Alves
 *
 */
@ApiModel
public class LaunchResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value = "Controles de paginacao", required=true)
	private Summary summary;
	
	@ApiModelProperty(value = "Lista de lancamento", required=true)
	private List<Launch> items;

	/**
	 * @return the summary
	 */
	public Summary getSummary() {
		return summary;
	}

	/**
	 * @param summary the summary to set
	 */
	public void setSummary(Summary summary) {
		this.summary = summary;
	}

	/**
	 * @return the items
	 */
	public List<Launch> getItems() {
		return items;
	}

	/**
	 * @param items the items to set
	 */
	public void setItems(List<Launch> items) {
		this.items = items;
	}
}
