package pe.com.dyd.arquitectura.patrones.facade;

import pe.com.dyd.arquitectura.patrones.facade.impl.IPaymentFacade;
import pe.com.dyd.arquitectura.patrones.facade.impl.PaymentFacadeImpl;
import pe.com.dyd.arquitectura.patrones.facade.impl.PaymentRequest;

public class Main {

	public static void main(String[] args) {
		
		try {
			IPaymentFacade facade = new PaymentFacadeImpl();
			PaymentRequest request = new PaymentRequest();
			request.setAmmount(500);
			request.setCardExpDate("10/2015");
			request.setCardName("Edgard Marquez");
			request.setCardNumber("1234567890123456");
			request.setCardSecureNumber("123");
			request.setCustomerId(1L);
			facade.pay(request);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
