package pe.com.dyd.arquitectura.patrones.facade.subsystems.bank;

import java.util.UUID;

import pe.com.dyd.arquitectura.patrones.facade.util.OnMemoryDataBase;

public class BankSystem {
	
	public String transfer(TransferRequest request) throws Exception {
		
		String cardNumberPrefix = request.getCardNumber().substring(0, 3);
		if (!OnMemoryDataBase.validateCardBins(cardNumberPrefix)) {
			throw new Exception("Tarjeta inválida");
		}
		
		String cardCompany = OnMemoryDataBase.getCardCompany(cardNumberPrefix);
		if ("AMEX".equals(cardCompany) && request.getCardNumber().length() != 15) {
			throw new Exception("El número de la tarjeta es inválida");
		} else if (("VISA".equals(cardCompany) || "MASTERCARD".equals(cardCompany)) && request.getCardNumber().length() != 16) {
			throw new Exception("El número de la tarjeta es inválida");
		}
		
		String number = request.getCardNumber();
		String cardNumberSubfix = request.getCardNumber().substring(number.length() - 4, number.length());
		System.out.println("Se ha realizado un cargo al cliente '"
				+ request.getCardNumber() + "' \n"
				+ "\tpor el monto de '" + request.getAmmount() + "' a la tarjeta con \n"
				+ "terminacion '" + cardNumberSubfix);
		
		return UUID.randomUUID().toString();
	}

}
