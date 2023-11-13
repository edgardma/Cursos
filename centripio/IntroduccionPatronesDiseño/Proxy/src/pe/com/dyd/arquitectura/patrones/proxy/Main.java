package pe.com.dyd.arquitectura.patrones.proxy;

import pe.com.dyd.arquitectura.patrones.factory.ServiceFactory;
import pe.com.dyd.arquitectura.patrones.proxy.impl.IProcessEjecutor;

public class Main {

	public static void main(String[] args) {
		IProcessEjecutor process = ServiceFactory.createProcessEjecutor();
		try {
			process.ejecuteProcess(1, "emarquez", "1234");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
