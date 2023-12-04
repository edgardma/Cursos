package pe.com.dyd.arquitectura.patrones.facade.util;

public class Customer {
	
	private Long customerId;
	private String name;
	private double balance;
	private String status;
	
	public Customer(Long customerId, String name, double balance, String status) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.balance = balance;
		this.status = status;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
