package co.simplon.p25.api.services;

import java.util.List;

import org.springframework.stereotype.Service;

import co.simplon.p25.api.dtos.CategoryView;
import co.simplon.p25.api.repositories.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categories;

    public CategoryServiceImpl(CategoryRepository categories) {
	this.categories = categories;
    }

    @Override
    public List<CategoryView> findAll() {
	return categories.findAllProjectedBy();
    }

}
