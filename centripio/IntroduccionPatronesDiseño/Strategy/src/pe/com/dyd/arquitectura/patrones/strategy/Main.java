package pe.com.dyd.arquitectura.patrones.strategy;

import pe.com.dyd.arquitectura.patrones.strategy.impl.AuthProvider;
import pe.com.dyd.arquitectura.patrones.strategy.impl.OnMemoryAuthStrategy;
import pe.com.dyd.arquitectura.patrones.strategy.impl.Principal;

public class Main {
	
	public static void main(String[] args) {
		AuthProvider authProvider = new AuthProvider(new OnMemoryAuthStrategy());
		
		String userName = "";
		String password = "";
		
		Principal principal = authProvider.authenticate(userName, password);
		System.out.println(principal.toString());
	}
	
}
