package co.simplon.p25.api.controller.Articles;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.p25.api.dtos.Articles.ArticleCreate;
import co.simplon.p25.api.dtos.Articles.ArticleLastAdded;
import co.simplon.p25.api.dtos.Articles.ArticleUpdate;
import co.simplon.p25.api.dtos.Articles.ArticleView;
import co.simplon.p25.api.services.ArticleService;

@RestController
@RequestMapping("/articles")
public class ArticleController {

    private final ArticleService service;

    public ArticleController(ArticleService service) {
	this.service = service;

    }

    @GetMapping("/list-articles")
    public List<ArticleView> getAllArticles() {
	return service.getAllArticles();

    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createArticle(
	    @RequestBody @ModelAttribute @Valid ArticleCreate article) {
	service.createArticle(article);
    }

    @DeleteMapping("/byId/{id}")
    public void deleteArticleById(
	    @PathVariable("id") Long id) {
	service.deleteArticleById(id);
    }

    @GetMapping("/article-view/{id}")
    public ArticleView getArticleById(
	    @PathVariable("id") Long id) {
	return service.findProjectedById(id);
    }

    @GetMapping("/articleLastAdded")
    public List<ArticleLastAdded> getTop4LastAdded() {
	return service.getTop4LastAdded();
    }

    @PatchMapping("/{id}")
    public void updateArticle(
	    @ModelAttribute @Valid @PathVariable("id") Long id,
	    ArticleUpdate article) {
	service.updateArticleById(id, article);
    }

}
