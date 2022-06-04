package co.simplon.p25.api.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.p25.api.dtos.ArticleCreate;
import co.simplon.p25.api.dtos.ArticleUpdate;
import co.simplon.p25.api.dtos.ArticleView;
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
    public void createArticle(@RequestBody ArticleCreate article) {
		service.createArticle(article);
    }
	
	
	 @DeleteMapping("/byId/{id}")
	    public void deleteArticleById(@PathVariable("id") Long id) {
		service.deleteArticleById(id);
	    }
	 
	 @DeleteMapping("/byTitle/{title}")
	    public void deleteArticleByTitle(@PathVariable("title") String title) {
		service.deleteArticleByTitle(title);
	    }
	 

	 
	 @GetMapping("/article-view/{id}")
	    public ArticleView getArticleById(@PathVariable("id") Long id) {
		return service.findProjectedById(id);
	    }

	   

	    @PutMapping("/{id}")
	    public void updateArticle(@PathVariable("id") Long id, @RequestBody ArticleUpdate article) {
		service.updateArticleById(id, article);
	    }
	
	
}
