package co.simplon.p25.api.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.p25.api.dtos.ArticleView;
import co.simplon.p25.api.entities.Article;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {
//	
	Optional<ArticleView> findProjectedById(Long id);
//	 <T> List<T> findAllProjectedBy(Class<T> type);

	List<ArticleView> findAllProjectedBy();

	void deleteByTitle(String title);
	
	
	
//	void updateByTitle(String title);

//	List<ArticleUpdate> findAllProjectedBy(Class<ArticleUpdate> class1);

	
	
}
