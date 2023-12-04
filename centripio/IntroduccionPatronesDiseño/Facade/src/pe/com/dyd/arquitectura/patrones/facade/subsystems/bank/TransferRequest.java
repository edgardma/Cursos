package pe.com.dyd.arquitectura.patrones.facade.subsystems.bank;

public class TransferRequest {
	
	private double ammount;
	private String cardNumber;
	private String cardName;
	private String cardExpDate;
	private String cardSecureNumber;
	
	public TransferRequest(double ammount, String cardNumber, String cardName, String cardExpDate,
			String cardSecureNumber) {
		super();
		this.ammount = ammount;
		this.cardNumber = cardNumber;
		this.cardName = cardName;
		this.cardExpDate = cardExpDate;
		this.cardSecureNumber = cardSecureNumber;
	}
	
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
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public String getCardExpDate() {
		return cardExpDate;
	}
	public void setCardExpDate(String cardExpDate) {
		this.cardExpDate = cardExpDate;
	}
	public String getCardSecureNumber() {
		return cardSecureNumber;
	}
	public void setCardSecureNumber(String cardSecureNumber) {
		this.cardSecureNumber = cardSecureNumber;
	}

	
}
