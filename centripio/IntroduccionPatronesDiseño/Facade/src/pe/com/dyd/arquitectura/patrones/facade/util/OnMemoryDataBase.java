package pe.com.dyd.arquitectura.patrones.facade.util;

import java.util.HashMap;

public class OnMemoryDataBase {
	
	private static final HashMap<Long, Customer> CUSTOMER_MAP = new HashMap<>();
	private static final HashMap<String, Card> CARD_BINS = new HashMap<>();
	
	static {
		CUSTOMER_MAP.put(1L, new Customer(1L, "Edgard Marquez", 500, "Suspendido"));
		CUSTOMER_MAP.put(2L, new Customer(2L, "Juan Perez", 300, "Suspendido"));
		CUSTOMER_MAP.put(3L, new Customer(3L, "Adrian Perez", 100, "Activo"));
		CUSTOMER_MAP.put(4L, new Customer(4L, "Melisa Mares", 100, "Baja"));
		
		CARD_BINS.put("123", new Card("123", "VISA", "Credimas"));
		CARD_BINS.put("234", new Card("234", "MASTERCARD", "Credimas"));
		CARD_BINS.put("345", new Card("345", "AMEX", "Credimas"));
	}

	public static boolean validateCardBins(String cardNumberPrefix) {
		return true;
	}

	public static String getCardCompany(String cardNumberPrefix) {
		return CARD_BINS.get(cardNumberPrefix).getName();
	}

	public static Customer findCustomerById(Long customerId) {
		return CUSTOMER_MAP.get(customerId);
	}

	public static void changeCustomerStatus(Long cutomerId, String newStatus) {
		
	}

}
