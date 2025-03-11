package pe.com.dyd.cursos.api.springsecuritycourse.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import pe.com.dyd.cursos.api.springsecuritycourse.dto.SaveCategory;
import pe.com.dyd.cursos.api.springsecuritycourse.exception.ObjectNotFoundException;
import pe.com.dyd.cursos.api.springsecuritycourse.persistence.entity.Category;
import pe.com.dyd.cursos.api.springsecuritycourse.persistence.repository.CategoryRepository;
import pe.com.dyd.cursos.api.springsecuritycourse.service.CategoryService;

import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Page<Category> findAll(Pageable pageable) {
        return categoryRepository.findAll(pageable);
    }

    @Override
    public Optional<Category> findOneById(Long categoryId) {
        return categoryRepository.findById(categoryId);
    }

    @Override
    public Category createOne(SaveCategory saveCategory) {
        Category category = new Category();
        category.setName(saveCategory.getName());
        category.setStatus(Category.CategoryStatus.ENABLED);

        return categoryRepository.save(category);
    }

    @Override
    public Category updateOneById(Long categoryId, SaveCategory saveCategory) {
        Category categoryFromDb = categoryRepository.findById(categoryId)
                .orElseThrow(() -> new ObjectNotFoundException("Category not found with id " + categoryId));
        categoryFromDb.setName(saveCategory.getName());

        return categoryRepository.save(categoryFromDb);
    }

    @Override
    public Category disableOneById(Long categoryId) {
        Category categoryFromDb = categoryRepository.findById(categoryId)
                .orElseThrow(() -> new ObjectNotFoundException("Category not found with id " + categoryId));
        categoryFromDb.setStatus(Category.CategoryStatus.DISABLED);

        return categoryRepository.save(categoryFromDb);
    }
}
