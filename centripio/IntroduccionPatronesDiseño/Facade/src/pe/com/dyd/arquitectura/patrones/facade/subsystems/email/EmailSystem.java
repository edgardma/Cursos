package pe.com.dyd.arquitectura.patrones.facade.subsystems.email;

import java.util.Map;

public class EmailSystem {
	
	public void sendEmail(Map<String, String> values) {
		String templete = "\n**********************************************************"
				+ "|To: $name\n"
				+ "|from: FacadeSyste\n"
				+ "Monto del pago: $ammount\n"
				+ "**********************************************************";
		
		for (String str: values.keySet()) {
			templete = templete.replace(str, values.get(str));
		}
		
		System.out.println(templete);
	}
}
