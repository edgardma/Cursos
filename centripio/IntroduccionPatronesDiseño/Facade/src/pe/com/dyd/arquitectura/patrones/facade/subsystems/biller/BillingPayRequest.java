package pe.com.dyd.arquitectura.patrones.facade.subsystems.biller;

public class BillingPayRequest {
	
	private long customerId;
	private double amount;

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

}
