package pe.com.dyd.arquitectura.patrones.strategy.impl;

import pe.com.dyd.arquitectura.patrones.strategy.util.OnMemoryDataBase;
import pe.com.dyd.arquitectura.patrones.strategy.util.User;

public class OnMemoryAuthStrategy implements IAuthStrategy {

	@Override
	public Principal authenticate(String userName, String password) {
		
		User user = OnMemoryDataBase.findUserByName(userName);
		if (user == null) {
			return null;
		} else if(!user.getPassword().equals(password)) {
			return null;
		} else {
			return new Principal(user.getUserName(), user.getRol());
		}
	}
	
}
