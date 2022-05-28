package co.simplon.p25.api.services;

import java.util.List;

import co.simplon.p25.api.dtos.ArticleCreate;
import co.simplon.p25.api.dtos.ArticleView;




public interface ArticleService {

	List<ArticleView> getAllArticles();
	
//	Article getById(Long id);
//	
//	void updateArticleById(Long id, ArticleUpdate article);
//	
//	List<ArticleUpdate> getArticleUpdate();
//
//	void deleteArticleById(Long id);
		
    void createArticle (ArticleCreate article);

//	Article updateArticleById(Long id);

    


}
