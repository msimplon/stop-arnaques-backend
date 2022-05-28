package co.simplon.p25.api.services;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import co.simplon.p25.api.dtos.ArticleCreate;
import co.simplon.p25.api.dtos.ArticleView;
import co.simplon.p25.api.entities.Article;
import co.simplon.p25.api.repositories.ArticleRepository;

@Service
public class ArticleServiceImpl implements ArticleService {

	private final ArticleRepository repo;

	public ArticleServiceImpl(ArticleRepository repo) {
		this.repo = repo;

	}

	@Override
	public List<ArticleView> getAllArticles() {
		return repo.findAllProjectedBy();
	}
	

	
	@Override
	@Transactional
	public void createArticle(ArticleCreate inputs) {
		Article article = new Article();
		article.setTitle(inputs.getTitle());
		article.setSubtitle(inputs.getSubTitle());
		article.setDescription(inputs.getDescription());
		article.setDate(inputs.getDate());
		article.setCategory(inputs.getCategory());
		repo.save(article);
	}
	
	
//	@Override
//  public Article getById(Long id) {
//	return repo.findById(id).get();
//
//  }
	
//
//		@Override
//	    @Transactional
//	    public void updateArticleById(Long id, ArticleUpdate inputs) {
//		 Article article = repo.findById(id).get();
//			article.setTitle(inputs.getTitle());
//			article.setSubtitle(inputs.getSubTitle());
//			article.setDescription(inputs.getDescription());
//			article.setDate(inputs.getDate());
//			article.setCategory(inputs.getCategory());
//			repo.save(article);
//	    }
//		
//		@Override
//	    public List<ArticleUpdate> getArticleUpdate() {
//		return repo.findAllProjectedBy(ArticleUpdate.class);
//	    }
//	
//	
//	public Article updateArticleById(Long id) {
//		return repo.findById(id).get();
//
//	}
//	
//	
//	
//
//	@Override
//	@Transactional
//	public void deleteArticleById(Long id) {
//		repo.deleteById(id);
//	    }
//
//	

	
}
