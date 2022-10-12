package pe.com.dyd.spring.boot.backend.apirest.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.com.dyd.spring.boot.backend.apirest.models.entity.Cliente;

public interface IClienteDao extends JpaRepository<Cliente, Long> {
	
}
