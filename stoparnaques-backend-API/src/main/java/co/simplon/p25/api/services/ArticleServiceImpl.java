package co.simplon.p25.api.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.simplon.p25.api.dtos.ArticleCreate;
import co.simplon.p25.api.dtos.ArticleUpdate;
import co.simplon.p25.api.dtos.ArticleView;
import co.simplon.p25.api.entities.Article;
import co.simplon.p25.api.entities.Category;
import co.simplon.p25.api.repositories.ArticleRepository;
import co.simplon.p25.api.repositories.CategoryRepository;

@Service
@Transactional(readOnly = true)
public class ArticleServiceImpl implements ArticleService {

    private final ArticleRepository repo;

    private final CategoryRepository categories;

    public ArticleServiceImpl(ArticleRepository repo,
	    CategoryRepository categories) {
	this.repo = repo;
	this.categories = categories;

    }

    @Override
    public List<ArticleView> getAllArticles() {
	return repo.findAllProjectedBy();
    }

    @Override
    @Transactional(readOnly = false)
    public void createArticle(ArticleCreate inputs) {
	Article article = new Article();
	article.setTitle(inputs.getTitle());
	article.setSubTitle(inputs.getSubTitle());
	article.setDescription(inputs.getDescription());
	article.setImageUrl(inputs.getImageUrl());
	article.setDate(inputs.getDate());
	Category category = categories
		.getById(inputs.getCategoryId());
	article.setCategory(category);
	repo.save(article);
    }

    @Override
    @Transactional
    public void updateArticleById(Long id,
	    ArticleUpdate inputs) {
	Article article = repo.findById(id).get();
	article.setTitle(inputs.getTitle());
	article.setSubTitle(inputs.getSubTitle());
	article.setDescription(inputs.getDescription());
	article.setImageUrl(inputs.getImageUrl());
	article.setDate(inputs.getDate());
	Category category = categories
		.getById(inputs.getCategoryId());
	article.setCategory(category);
	repo.save(article);
    }

    @Override
    @Transactional
    public void deleteArticleById(Long id) {
	repo.deleteById(id);
    }

    @Override
    @Transactional
    public void deleteArticleByTitle(String title) {
	repo.deleteByTitle(title);

    }

    @Override
    public ArticleView findProjectedById(Long id) {

	return repo.findProjectedById(id).get();
    }

}
