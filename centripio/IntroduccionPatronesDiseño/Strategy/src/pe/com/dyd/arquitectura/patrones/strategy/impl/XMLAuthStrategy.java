package pe.com.dyd.arquitectura.patrones.strategy.impl;

import pe.com.dyd.arquitectura.patrones.strategy.util.XMLUserUtil;

public class XMLAuthStrategy implements IAuthStrategy {

	@Override
	public Principal authenticate(String userName, String password) {
	    String rol = XMLUserUtil.getRolByPrincipal(userName, password);
		
	    if (rol != null) {
	    	return new Principal(userName, rol);
	    }
	    
		return null;
	}

}
