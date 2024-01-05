package pe.com.dyd.arquitectura.factorymethod;

public abstract class CocheFactory {
	
	public Coche crea() {
		Coche coche = creaCoche();
		
		coche.ponerChasis();
		coche.ponerMandos();
		coche.ponerRuedas();
		
		return coche;
	}

	protected abstract Coche creaCoche();
	
}
