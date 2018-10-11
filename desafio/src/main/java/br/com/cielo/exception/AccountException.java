package br.com.cielo.exception;

public class AccountException extends Exception {

	private static final long serialVersionUID = 1L;

	public AccountException(Exception e) {
		super(e);
	}
	
	public AccountException(String message, Exception e) {
		super(message, e);
	}
}
