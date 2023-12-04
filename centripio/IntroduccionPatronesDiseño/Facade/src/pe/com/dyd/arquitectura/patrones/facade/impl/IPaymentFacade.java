package pe.com.dyd.arquitectura.patrones.facade.impl;

public interface IPaymentFacade {
	
	public PaymentResponse pay(PaymentRequest request) throws PaymentException;
	
}
