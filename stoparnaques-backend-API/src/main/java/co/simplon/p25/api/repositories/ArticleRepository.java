package co.simplon.p25.api.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.p25.api.dtos.Articles.ArticleLastAdded;
import co.simplon.p25.api.dtos.Articles.ArticleView;
import co.simplon.p25.api.entities.Article;

@Repository
public interface ArticleRepository
	extends JpaRepository<Article, Long> {

    Optional<ArticleView> findProjectedById(Long id);

    List<ArticleView> findAllProjectedBy();

    List<ArticleLastAdded> findTop4ByOrderByCreatedAtDesc();

    void deleteByTitle(String title);

//	void updateByTitle(String title);

//	List<ArticleUpdate> findAllProjectedBy(Class<ArticleUpdate> class1);

}
