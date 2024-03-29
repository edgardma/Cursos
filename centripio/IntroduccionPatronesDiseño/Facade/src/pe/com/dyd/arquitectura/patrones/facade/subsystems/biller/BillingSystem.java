package pe.com.dyd.arquitectura.patrones.facade.subsystems.biller;

import pe.com.dyd.arquitectura.patrones.facade.util.Customer;
import pe.com.dyd.arquitectura.patrones.facade.util.OnMemoryDataBase;

public class BillingSystem {
	
	public double queryCustomerBalance(Long customerId) {
		Customer customer = OnMemoryDataBase.findCustomerById(customerId);
		
		return customer.getBalance();
	}
	
	public double pay(BillingPayRequest billingPay) {
		Customer customer = OnMemoryDataBase.findCustomerById(billingPay.getCustomerId());
		customer.setBalance(customer.getBalance() - billingPay.getAmount());
		
		System.out.println("Pago aplicado al cliente '" + customer.getName() + "', "
				+ "el nuevo saldo es '" + customer.getBalance());
		
		return customer.getBalance();
	}
	
}
