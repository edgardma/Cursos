package pe.com.dyd.arquitectura.patrones.facade.util;

public class Card {
	
	private String idCard;
	private String name;
	private String type;
	
	public Card(String idCard, String name, String type) {
		super();
		this.idCard = idCard;
		this.name = name;
		this.type = type;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
