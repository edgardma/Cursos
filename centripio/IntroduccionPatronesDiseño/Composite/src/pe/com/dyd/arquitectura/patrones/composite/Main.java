package pe.com.dyd.arquitectura.patrones.composite;

import pe.com.dyd.arquitectura.patrones.composite.pos.Order;
import pe.com.dyd.arquitectura.patrones.composite.product.CompositeProduct;
import pe.com.dyd.arquitectura.patrones.composite.product.SimpleProduct;

public class Main {

	public static void main(String[] args) {
		
		SimpleProduct ram4gb = new SimpleProduct("Memoria RAM 4GB", 750, "KingStone");
		SimpleProduct ram8gb = new SimpleProduct("Memoria RAM 8GB", 1000, "KingStone");
		SimpleProduct disk500gb = new SimpleProduct("Disco Duro 500GB", 1500, "ACME");
		SimpleProduct disk1tb = new SimpleProduct("Disco Duro 1TB", 2000, "ACME");
		SimpleProduct cpuAMD = new SimpleProduct("AMD Phenon", 4000, "AMD");
		SimpleProduct cpuIntel = new SimpleProduct("Inte i7", 4500, "Intel");
		SimpleProduct smallCabinete = new SimpleProduct("Gabinete Pequeño", 2000, "ACME");
		SimpleProduct bigCabinete = new SimpleProduct("Gabinete Grande", 2200, "ACME");
		SimpleProduct monitor30inch = new SimpleProduct("Monitor 30inch", 2000, "Samsung");
		SimpleProduct simpleMouse = new SimpleProduct("Raton Simple", 150, "Genius");
		SimpleProduct gammerMouse = new SimpleProduct("Raton Gammer", 750, "Alien");
		SimpleProduct keyboard = new SimpleProduct("Keyboard", 100, "ACME");
		
		CompositeProduct keyboardAndMouse = new CompositeProduct("Keyboard Mouse", 0);
		keyboardAndMouse.addProduct(simpleMouse);
		keyboardAndMouse.addProduct(keyboard);
		
		CompositeProduct package1 = new CompositeProduct("Desktop PC", 0);
		package1.addProduct(ram4gb);
		package1.addProduct(disk500gb);
		package1.addProduct(cpuIntel);
		package1.addProduct(keyboardAndMouse);
		
		CompositeProduct package2 = new CompositeProduct("Gamer PC", 0);
		package2.addProduct(ram8gb);
		package2.addProduct(ram8gb);
		package2.addProduct(ram8gb);
		package2.addProduct(ram8gb);
		package2.addProduct(disk1tb);
		package2.addProduct(bigCabinete);
		package2.addProduct(monitor30inch);
		package2.addProduct(keyboardAndMouse);
		package2.addProduct(package1);
		
		Order order1 = new Order(11, "Edgard Marquez");
		order1.addProduct(package1);
		order1.addProduct(smallCabinete);
		order1.printOrder();
		
		Order order2 = new Order(12, "Edgard Marquez");
		order2.addProduct(package2);
		order2.printOrder();
	}

}
