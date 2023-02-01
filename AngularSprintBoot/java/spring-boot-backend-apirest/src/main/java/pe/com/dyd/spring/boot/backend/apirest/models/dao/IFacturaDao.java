package pe.com.dyd.spring.boot.backend.apirest.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.com.dyd.spring.boot.backend.apirest.models.entity.Factura;

public interface IFacturaDao extends JpaRepository<Factura, Long> {

}
