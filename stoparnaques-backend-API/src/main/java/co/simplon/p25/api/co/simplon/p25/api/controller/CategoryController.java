package co.simplon.p25.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.p25.api.dtos.CategoryView;
import co.simplon.p25.api.services.CategoryService;

@CrossOrigin
@RestController
@RequestMapping("/categories")
public class CategoryController {

    private final CategoryService service;

    public CategoryController(CategoryService service) {
	this.service = service;
    }

    @GetMapping
    public List<CategoryView> findAll() {
	return service.findAll();
    }

}
