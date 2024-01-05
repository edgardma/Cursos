package pe.com.dyd.arquitectura.factorymethod;

public class Main {

	public static void main(String[] args) {
		
		CocheFactory factory = new CocheInglesFactory();
		Coche coche = factory.crea();
	}

}
