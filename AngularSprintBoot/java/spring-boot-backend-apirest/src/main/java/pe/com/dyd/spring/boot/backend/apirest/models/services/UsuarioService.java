package pe.com.dyd.spring.boot.backend.apirest.models.services;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.com.dyd.spring.boot.backend.apirest.models.dao.IUsuarioDao;
import pe.com.dyd.spring.boot.backend.apirest.models.entity.Usuario;

@Service
public class UsuarioService implements UserDetailsService {
	
	private static final String INFO_ROL = "Rol: '{0}'";
	private static final String ERROR_LOGIN_NO_EXISTE1 = "Error en el login: no existe el usuario '{0}' en el sistema!!";
	private static final String ERROR_LOGIN_NO_EXISTE2 = "Error en el login: no existe el usuario '%s' en el sistema!!";

	private final Logger log = LoggerFactory.getLogger(UsuarioService.class);
	
	@Autowired
	private IUsuarioDao usuarioDao; 
	
	@Override
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = usuarioDao.findByUsername(username);
		
		if (usuario == null) {
			log.error(ERROR_LOGIN_NO_EXISTE1, username);
			throw new UsernameNotFoundException(String.format(ERROR_LOGIN_NO_EXISTE2, username));
		}
		
		List<GrantedAuthority> authorities = usuario.getRoles()
				.stream()
				.map(role -> new SimpleGrantedAuthority(role.getNombre()))
				.peek(autority -> log.info(INFO_ROL, autority.getAuthority()))
				.collect(Collectors.toList());
		
		return new User(usuario.getUsername(), usuario.getPassword(), authorities);
	}

}
