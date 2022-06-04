package co.simplon.p25.api.controller;


import org.springframework.web.bind.annotation.PathVariable;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.p25.api.dtos.CategoryView;
import co.simplon.p25.api.services.CategoryService;


@RestController
@RequestMapping("/articles/category-view/{id}")
public class CategoryController {

	private final CategoryService service;

	public CategoryController(CategoryService service) {
		this.service = service;
	}
	
	@GetMapping
	public CategoryView getCategoryById(@PathVariable("id") Long id){
			return service.findProjectedById(id);
		}
		

}
