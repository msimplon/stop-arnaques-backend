package co.simplon.p25.api.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.p25.api.dtos.ArticleCreate;
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
	
	@PostMapping ("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void createArticle(@RequestBody ArticleCreate article) {
		service.createArticle(article);
    }
	
	
//	 @DeleteMapping("/{articleId}")
//	    public void deleteArticle(@PathVariable("id") Long id) {
//		service.deleteArticleById(id);
//	    }
//	 
//	 @GetMapping("/articleUpdate")
//	    public Article updateArticleById(@PathVariable("id") Long id) {
//		return service.updateArticleById(id);
//	    }
//
//	    @GetMapping("/update")
//	    public List<ArticleUpdate> getArticleUpdate() {
//		return service.getArticleUpdate();
//	    }
//
//	    @PutMapping("/{id}")
//	    public void updateArticle(@PathVariable Long id, @RequestBody ArticleUpdate article) {
//		service.updateArticleById(id, article);
//	    }
//	
	
}
