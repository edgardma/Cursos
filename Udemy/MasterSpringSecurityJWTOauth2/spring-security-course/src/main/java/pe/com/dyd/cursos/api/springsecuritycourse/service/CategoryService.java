package pe.com.dyd.cursos.api.springsecuritycourse.service;

import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import pe.com.dyd.cursos.api.springsecuritycourse.dto.SaveCategory;
import pe.com.dyd.cursos.api.springsecuritycourse.persistence.entity.Category;

import java.util.Optional;

public interface CategoryService {
    Page<Category> findAll(Pageable pageable);

    Optional<Category> findOneById(Long categoryId);

    Category createOne(@Valid SaveCategory saveCategory);

    Category updateOneById(Long categoryId, @Valid SaveCategory saveCategory);

    Category disableOneById(Long categoryId);
}
