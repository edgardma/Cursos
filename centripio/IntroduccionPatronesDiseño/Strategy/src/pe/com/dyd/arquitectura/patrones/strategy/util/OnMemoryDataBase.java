package pe.com.dyd.arquitectura.patrones.strategy.util;

public class OnMemoryDataBase {

	public static User findUserByName(String userName) {
		return new User("", "", "");
	}

}
