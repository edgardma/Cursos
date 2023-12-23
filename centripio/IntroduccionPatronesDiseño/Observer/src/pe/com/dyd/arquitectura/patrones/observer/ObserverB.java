package pe.com.dyd.arquitectura.patrones.observer;

public class ObserverB implements IObserver {

	@Override
	public void notify(String command, Object source) {
		System.out.println("Observer B -> " + command + " > " + source.toString());
	}

}
