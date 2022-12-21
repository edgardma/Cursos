package pe.com.dyd.spring.boot.backend.apirest.models.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import pe.com.dyd.spring.boot.backend.apirest.models.entity.Cliente;
import pe.com.dyd.spring.boot.backend.apirest.models.entity.Region;

public interface IClienteService {
	
	public List<Cliente> fidAll();
	
	public Page<Cliente> fidAll(Pageable pageable);
	
	public Cliente findById(Long id);
	
	public Cliente save(Cliente cliente);
	
	public void delete(Long id);
	
	public List<Region> findAllRegiones();
}
