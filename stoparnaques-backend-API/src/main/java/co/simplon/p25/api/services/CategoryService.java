package co.simplon.p25.api.services;

import java.util.List;

import co.simplon.p25.api.dtos.CategoryView;

public interface CategoryService {

    List<CategoryView> findAll();

}
