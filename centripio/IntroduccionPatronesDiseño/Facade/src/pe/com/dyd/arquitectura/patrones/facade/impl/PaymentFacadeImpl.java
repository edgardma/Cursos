package pe.com.dyd.arquitectura.patrones.facade.impl;

import java.util.HashMap;
import java.util.Map;

import pe.com.dyd.arquitectura.patrones.facade.subsystems.bank.BankSystem;
import pe.com.dyd.arquitectura.patrones.facade.subsystems.bank.TransferRequest;
import pe.com.dyd.arquitectura.patrones.facade.subsystems.biller.BillingPayRequest;
import pe.com.dyd.arquitectura.patrones.facade.subsystems.biller.BillingSystem;
import pe.com.dyd.arquitectura.patrones.facade.subsystems.crm.CRMSystem;
import pe.com.dyd.arquitectura.patrones.facade.subsystems.email.EmailSystem;
import pe.com.dyd.arquitectura.patrones.facade.util.Customer;
import pe.com.dyd.arquitectura.patrones.facade.util.OnMemoryDataBase;

public class PaymentFacadeImpl implements IPaymentFacade {

	private BankSystem bankSystem = new BankSystem();
	private BillingSystem billingSystem = new BillingSystem();
	private CRMSystem crmSystem = new CRMSystem();
	private EmailSystem emailSystem = new EmailSystem();
	
	@Override
	public PaymentResponse pay(PaymentRequest request) throws PaymentException {
		try {
			
			Customer customer = crmSystem.findCustomer(request.getCustomerId());
			if (customer == null) {
				throw new PaymentException("Cliente no existe");
			} else if(customer.getStatus().equals("Baja")) {
				throw new PaymentException("El Cliente esta dado de baja");
			}
			
			TransferRequest bankRequest = new TransferRequest(
					request.getAmmount(), 
					request.getCardNumber(), 
					request.getCardName(), 
					request.getCardExpDate(), 
					request.getCardSecureNumber());
			String payReference = bankSystem.transfer(bankRequest);
			
			BillingPayRequest billingRequest = new BillingPayRequest(
					request.getCustomerId(), 
					request.getAmmount());
			double newBalance = billingSystem.pay(billingRequest);
			
			String newStatus = customer.getStatus();
			if (newBalance <= 50) {
				newStatus = "Activo";
				OnMemoryDataBase.changeCustomerStatus(request.getCustomerId(), newStatus);				
			}
			
			Map<String, String> params = new HashMap<>();
			params.put("$name", customer.getName());
			params.put("$amount", request.getAmmount() + "");
			params.put("$newBalance", newBalance + "");
			params.put("$cardNumber", "");
			params.put("$reference", "");
			params.put("$newStatus", "");
			emailSystem.sendEmail(params);
			
			return new PaymentResponse(
					payReference,
					newBalance,
					newStatus);
			
		} catch(Exception ex) {
			throw new PaymentException(ex.getMessage());
		}
		
	}

}
