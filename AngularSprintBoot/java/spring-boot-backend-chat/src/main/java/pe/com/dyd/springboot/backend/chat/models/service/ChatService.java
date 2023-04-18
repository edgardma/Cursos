package pe.com.dyd.springboot.backend.chat.models.service;

import java.util.List;

import pe.com.dyd.springboot.backend.chat.models.documents.Mensaje;

public interface ChatService {
	
	public List<Mensaje> obtenerUltimos10Mensajes();
	
	public Mensaje guardar(Mensaje mensaje);

}
