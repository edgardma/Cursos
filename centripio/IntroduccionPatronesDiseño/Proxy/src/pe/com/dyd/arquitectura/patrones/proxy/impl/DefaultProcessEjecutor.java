package pe.com.dyd.arquitectura.patrones.proxy.impl;

public class DefaultProcessEjecutor implements IProcessEjecutor {

	@Override
	public void ejecuteProcess(int idProcess, String user, String pasword) throws Exception {
		System.out.println("Proceso ejecutado!!");
	}

}
