package pe.com.dyd.arquitectura.patrones.facade.util;

import pe.com.dyd.arquitectura.patrones.facade.subsystems.crm.Customer;

public class OnMemoryDataBase {

	public static boolean validateCardBins(String cardNumberPrefix) {
		return false;
	}

	public static String getCardCompany(String cardNumberPrefix) {
		return null;
	}

	public static Customer findCustomerById(Long customerId) {
		return null;
	}

}
