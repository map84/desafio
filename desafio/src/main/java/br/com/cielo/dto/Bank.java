package br.com.cielo.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 * @author Marcos Alves
 *
 */
@ApiModel
public class Bank implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@NotNull(message="agency is required")
	@ApiModelProperty(value = "Agencia", required=true)
	private Long agency;
	
	@NotEmpty(message="account is required")
	@Size(min = 1, max = 10, message="name: size must be between 1 and 10 characters")
	@ApiModelProperty(value = "Conta", required=true)
	private String account;
	
	@NotEmpty(message="name is required")
	@Size(min = 1, max = 250, message="name: size must be between 1 and 250 characters")
	@ApiModelProperty(value = "Banco", required=true)
	private String name;

	/**
	 * @return the agency
	 */
	public Long getAgency() {
		return agency;
	}

	/**
	 * @param agency the agency to set
	 */
	public void setAgency(Long agency) {
		this.agency = agency;
	}

	/**
	 * @return the account
	 */
	public String getAccount() {
		return account;
	}

	/**
	 * @param account the account to set
	 */
	public void setAccount(String account) {
		this.account = account;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
