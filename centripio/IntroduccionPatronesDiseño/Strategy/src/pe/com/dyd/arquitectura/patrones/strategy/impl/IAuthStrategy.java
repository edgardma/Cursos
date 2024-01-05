package pe.com.dyd.arquitectura.patrones.strategy.impl;

public interface IAuthStrategy {
	
	public Principal authenticate(String userName, String password);
	
}
