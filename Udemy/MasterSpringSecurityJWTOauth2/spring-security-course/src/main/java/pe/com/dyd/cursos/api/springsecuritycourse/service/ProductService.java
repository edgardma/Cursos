package pe.com.dyd.cursos.api.springsecuritycourse.service;

import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import pe.com.dyd.cursos.api.springsecuritycourse.dto.SaveProduct;
import pe.com.dyd.cursos.api.springsecuritycourse.persistence.entity.Product;

import java.util.Optional;

public interface ProductService {

    Page<Product> findAll(Pageable pageable);

    Optional<Product> findOneById(Long productId);

    Product createOne(@Valid SaveProduct saveProduct);

    Product updateOneById(Long productId, @Valid SaveProduct saveProduct);

    Product disableOneById(Long productId);
}
