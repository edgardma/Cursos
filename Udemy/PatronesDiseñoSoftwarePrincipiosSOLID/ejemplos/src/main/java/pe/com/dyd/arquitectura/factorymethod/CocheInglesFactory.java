package pe.com.dyd.arquitectura.factorymethod;

public class CocheInglesFactory extends CocheFactory {

	@Override
	protected Coche creaCoche() {
		return new CochePilotoDerecha();
	}

}
