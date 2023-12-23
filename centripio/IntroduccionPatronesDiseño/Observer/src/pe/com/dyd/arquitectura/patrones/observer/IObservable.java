package pe.com.dyd.arquitectura.patrones.observer;

public interface IObservable {
	
	public void notifyAllObserver(String command, Object source);
	
	public void addObserver(IObserver observer);
	
	public void removeObserver(IObserver observer);
	
}
