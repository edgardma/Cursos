package pe.com.dyd.arquitectura.patrones.observer;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;

public class Main {

	public static void main(String[] args) {
		
		ConfigurationManager manager = ConfigurationManager.getInstance();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		NumberFormat moneyFormat = new DecimalFormat("###,##0.00");
		
		IObserver a = new ObserverA();
		IObserver b = new ObserverB();
		
		manager.addObserver(a);
		manager.addObserver(b);
		
		manager.setDateFormat(dateFormat);
		manager.setMoneyFormat(moneyFormat);
		
		System.out.println("Fin");
	}

}
