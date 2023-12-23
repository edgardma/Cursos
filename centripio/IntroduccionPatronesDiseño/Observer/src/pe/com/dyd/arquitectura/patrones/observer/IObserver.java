package pe.com.dyd.arquitectura.patrones.observer;

public interface IObserver {
	
	public void notify(String command, Object source);
	
}
