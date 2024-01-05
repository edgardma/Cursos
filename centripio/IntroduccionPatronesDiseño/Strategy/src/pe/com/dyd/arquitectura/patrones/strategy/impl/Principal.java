package pe.com.dyd.arquitectura.patrones.strategy.impl;

public class Principal {
	
	private String userName;
	private String rol;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	public Principal(String userName, String rol) {
		super();
		this.userName = userName;
		this.rol = rol;
	}
	@Override
	public String toString() {
		return "Principal [userName=" + userName + ", rol=" + rol + "]";
	}
	
}
