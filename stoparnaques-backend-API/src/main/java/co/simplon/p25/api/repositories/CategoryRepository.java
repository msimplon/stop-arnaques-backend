package co.simplon.p25.api.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.p25.api.dtos.Articles.CategoryView;
import co.simplon.p25.api.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    List<CategoryView> findAllProjectedBy();
}
