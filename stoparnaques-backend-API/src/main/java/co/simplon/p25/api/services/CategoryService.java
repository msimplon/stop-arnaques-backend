package co.simplon.p25.api.services;


import co.simplon.p25.api.dtos.CategoryView;

public interface CategoryService {
	

	CategoryView findProjectedById(Long id);

}
