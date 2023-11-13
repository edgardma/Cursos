package pe.com.dyd.arquitectura.patrones.proxy.impl;

import pe.com.dyd.arquitectura.patrones.proxy.services.AuditService;
import pe.com.dyd.arquitectura.patrones.proxy.services.SecurityService;

public class ProcessEjecutorProxy implements IProcessEjecutor {

	@Override
	public void ejecuteProcess(int idProcess, String user, String pasword) throws Exception {
		SecurityService security = new SecurityService();
		boolean authentica = security.authorization(user, pasword);
		if (!authentica) {
			throw new Exception("Autorización denegada");
		}
		
		DefaultProcessEjecutor process = new DefaultProcessEjecutor();
		process.ejecuteProcess(idProcess, user, pasword);
		
		AuditService audit = new AuditService();
		audit.auditServiceUsed(user, DefaultProcessEjecutor.class.getSimpleName());
		
	}

}
