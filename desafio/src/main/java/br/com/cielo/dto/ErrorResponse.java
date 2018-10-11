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
public class ErrorResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value="Tipo dpo erro")
	private ErrorType errorType;
	
	@ApiModelProperty(value="Motivo do erro")
	private List<String> reason;

	/**
	 * Constructor
	 * @param errorType
	 * @param reason
	 */
	public ErrorResponse(ErrorType errorType, List<String> reason) {
		super();
		this.errorType = errorType;
		this.reason = reason;
	}

	/**
	 * @return the errorType
	 */
	public ErrorType getErrorType() {
		return errorType;
	}

	/**
	 * @param errorType the errorType to set
	 */
	public void setErrorType(ErrorType errorType) {
		this.errorType = errorType;
	}

	/**
	 * @return the reason
	 */
	public List<String> getReason() {
		return reason;
	}

	/**
	 * @param reason the reason to set
	 */
	public void setReason(List<String> reason) {
		this.reason = reason;
	}
}
