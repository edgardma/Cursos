package pe.com.dyd.arquitectura.patrones.strategy.impl;

public class AuthProvider {
	
	private IAuthStrategy authStrategy;
	
	public AuthProvider(IAuthStrategy authStrategy) {
		this.authStrategy = authStrategy;
	}
	
	public void setAuthStrategy(IAuthStrategy authStrategy) {
		this.authStrategy = authStrategy;
	}
	
	public Principal authenticate(String userName, String password) {
		return authStrategy.authenticate(userName, password);
	}
}
