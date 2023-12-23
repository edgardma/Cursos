package pe.com.dyd.arquitectura.patrones.observer;

public class ObserverA implements IObserver {

	@Override
	public void notify(String command, Object source) {
		System.out.println("Observer A -> " + command + " > " + source.toString());
	}
	
}
