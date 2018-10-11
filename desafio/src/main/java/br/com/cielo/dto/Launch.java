package br.com.cielo.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 * @author Marcos Alves
 *
 */
@ApiModel
public class Launch implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@NotNull(message="id is required")
	@ApiModelProperty(value = "Numero", required=true)
	private String id;
	
	@NotNull(message="effectiveDate is required")
	@ApiModelProperty(value="Data do lancamento (Formato: yyyy-MM-dd)", required=true)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone="America/Sao_Paulo")
	private Date effectiveDate;
	
	@NotNull(message="status is required")
	@ApiModelProperty(value="Situacao", required=true)
	private Status status;
	
	@NotNull(message="confirmDate is required")
	@ApiModelProperty(value="Data de confirmacao (Formato: yyyy-MM-dd)", required=true)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone="America/Sao_Paulo")
	private Date confirmDate;
	
	@NotEmpty(message="description is required")
	@Size(min = 1, max = 250, message="description: size must be between 1 and 250 characters")
	@ApiModelProperty(value = "Descricao", required=true)
	private String description;
	
	@NotEmpty(message="amount is required")
	@ApiModelProperty(value = "Valor", required=true)
	private BigDecimal amount;
	
	@NotEmpty(message="bank is required")
	@ApiModelProperty(value = "Domicilio Bancario", required=true)
	private Bank bank;


	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}


	/**
	 * @return the effectiveDate
	 */
	public Date getEffectiveDate() {
		return effectiveDate;
	}


	/**
	 * @param effectiveDate the effectiveDate to set
	 */
	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}


	/**
	 * @return the status
	 */
	public Status getStatus() {
		return status;
	}


	/**
	 * @param status the status to set
	 */
	public void setStatus(Status status) {
		this.status = status;
	}


	/**
	 * @return the confirmDate
	 */
	public Date getConfirmDate() {
		return confirmDate;
	}


	/**
	 * @param confirmDate the confirmDate to set
	 */
	public void setConfirmDate(Date confirmDate) {
		this.confirmDate = confirmDate;
	}


	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}


	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}


	/**
	 * @return the amount
	 */
	public BigDecimal getAmount() {
		return amount;
	}


	/**
	 * @param amount the amount to set
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}


	/**
	 * @return the bank
	 */
	public Bank getBank() {
		return bank;
	}


	/**
	 * @param bank the bank to set
	 */
	public void setBank(Bank bank) {
		this.bank = bank;
	}
}
