package com.Rama_Solution.backend_pfe.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Rama_Solution.backend_pfe.entities.Article;
import com.Rama_Solution.backend_pfe.service.ArticleServiceImpl;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ArticleController {
	@Autowired
	private ArticleServiceImpl articleServiceImpl;
	
	@PostMapping("/addArticle")
	public Article addArticle(@RequestBody Article art) {
		return articleServiceImpl.addArticle(art);
	}
	
	@GetMapping("/findAllArticles")
	public List<Article> findAllArticles() {
		return articleServiceImpl.findAllArticles();
	}
	
	@GetMapping("/findArticleById")
	public Article findArticleById(Long id) {
		return articleServiceImpl.findArticleById(id);
	}
	
	@DeleteMapping("/deleteArticleById")
	public void deleteArticleById(@RequestParam Long id) {
		articleServiceImpl.deleteArticleById(id);
	}
	
	@PutMapping("/updateArticle")
	public Article updateArticle(@RequestBody Article art) {
		return articleServiceImpl.updateArticle(art);
	}
}
