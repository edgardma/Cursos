package pe.com.dyd.spring.boot.backend.apirest.models.services;

import pe.com.dyd.spring.boot.backend.apirest.models.entity.Usuario;

public interface IUsuarioService {

	public Usuario findByUserName(String username);
	
}
