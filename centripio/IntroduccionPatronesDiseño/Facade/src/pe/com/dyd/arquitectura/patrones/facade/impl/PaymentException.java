package pe.com.dyd.arquitectura.patrones.facade.impl;

public class PaymentException extends Exception {

	private static final long serialVersionUID = 1L;

	public PaymentException(String message) {
		super(message);
	}
	
}
