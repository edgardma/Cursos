package pe.com.dyd.cursos.api.springsecuritycourse.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.com.dyd.cursos.api.springsecuritycourse.persistence.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
