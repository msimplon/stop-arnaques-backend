package co.simplon.p25.api.services;


import org.springframework.stereotype.Service;

import co.simplon.p25.api.dtos.CategoryView;
import co.simplon.p25.api.repositories.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {
	
private final CategoryRepository repo;
	
	public CategoryServiceImpl(CategoryRepository repo) {
		this.repo = repo;
	}
	
	@Override
	public CategoryView findProjectedById(Long id) {
		return repo.findProjectedById(id).get();
	}


}

