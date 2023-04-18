package pe.com.dyd.springboot.backend.chat.models.documents;

import java.io.Serializable;
import java.util.Date;

public class Mensaje implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String texto;
	private Date fecha;
	private String username;
	private String tipo;
	
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
