package pe.com.dyd.arquitectura.patrones.factory;

import pe.com.dyd.arquitectura.patrones.proxy.impl.IProcessEjecutor;
import pe.com.dyd.arquitectura.patrones.proxy.impl.ProcessEjecutorProxy;

public class ServiceFactory {
	
	public static IProcessEjecutor createProcessEjecutor() {
		return new ProcessEjecutorProxy();
	}
	
}
