package pe.com.dyd.arquitectura.patrones.facade.subsystems.bank;

public class TransferRquest {
	
	String cardNumber;
	double ammount;

	public double getAmmount() {
		return ammount;
	}

	public void setAmmount(double ammount) {
		this.ammount = ammount;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

}
