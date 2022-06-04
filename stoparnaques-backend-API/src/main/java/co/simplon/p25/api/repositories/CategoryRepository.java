package co.simplon.p25.api.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.p25.api.dtos.CategoryView;
import co.simplon.p25.api.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
	
//	Optional<CatgeoryView> findProjectedById(Long id);

	CategoryView findProjectedById(Long id);
}
 