package co.simplon.p25.api.services;

import java.util.List;

import co.simplon.p25.api.dtos.ArticleCreate;
import co.simplon.p25.api.dtos.ArticleUpdate;
import co.simplon.p25.api.dtos.ArticleView;

public interface ArticleService {

    List<ArticleView> getAllArticles();

    void deleteArticleById(Long id);

    void deleteArticleByTitle(String title);

    void createArticle(ArticleCreate article);

    void updateArticleById(Long id, ArticleUpdate inputs);

    ArticleView findProjectedById(Long id);

}
