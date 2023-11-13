package pe.com.dyd.arquitectura.patrones.proxy.services;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AuditService {
	public void auditServiceUsed(String user, String service) {
		SimpleDateFormat formater = new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
		System.out.println(user + " utilizó el servicio > "
				+ service + ", a las " + formater.format(new Date()));
	}
}
