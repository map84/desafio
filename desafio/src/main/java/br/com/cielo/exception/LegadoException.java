package br.com.cielo.exception;

public class LegadoException extends Exception {

	private static final long serialVersionUID = 1L;

	public LegadoException(Exception e) {
		super(e);
	}
	
	public LegadoException(String message, Exception e) {
		super(message, e);
	}
}
