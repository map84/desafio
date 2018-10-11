package br.com.cielo.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 * @author Marcos Alves
 *
 */
@ApiModel
public class Summary implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value = "Tamanho da Pagina", required=true)
	private Integer pageSize;
	
	@ApiModelProperty(value = "Total de registros", required=true)
	private Integer totalElements;
	
	@ApiModelProperty(value = "Indicador primeiro registro", required=true)
	private Integer firstRegister;

	@ApiModelProperty(value = "Valor total", required=true)
	private BigDecimal totalAmount;

	/**
	 * @return the pageSize
	 */
	public Integer getPageSize() {
		return pageSize;
	}

	/**
	 * @param pageSize the pageSize to set
	 */
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	/**
	 * @return the totalElements
	 */
	public Integer getTotalElements() {
		return totalElements;
	}

	/**
	 * @param totalElements the totalElements to set
	 */
	public void setTotalElements(Integer totalElements) {
		this.totalElements = totalElements;
	}

	/**
	 * @return the firstRegister
	 */
	public Integer getFirstRegister() {
		return firstRegister;
	}

	/**
	 * @param firstRegister the firstRegister to set
	 */
	public void setFirstRegister(Integer firstRegister) {
		this.firstRegister = firstRegister;
	}

	/**
	 * @return the totalAmount
	 */
	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	/**
	 * @param totalAmount the totalAmount to set
	 */
	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}
}
