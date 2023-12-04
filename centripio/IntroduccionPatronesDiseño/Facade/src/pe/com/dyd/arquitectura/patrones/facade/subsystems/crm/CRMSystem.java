package pe.com.dyd.arquitectura.patrones.facade.subsystems.crm;

import pe.com.dyd.arquitectura.patrones.facade.util.Customer;
import pe.com.dyd.arquitectura.patrones.facade.util.OnMemoryDataBase;

public class CRMSystem {
	
	public Customer findCustomer(Long customerId) {
		return OnMemoryDataBase.findCustomerById(customerId);
	}

}
