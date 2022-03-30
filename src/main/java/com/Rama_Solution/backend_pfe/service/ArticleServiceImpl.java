package com.Rama_Solution.backend_pfe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Rama_Solution.backend_pfe.entities.Article;
import com.Rama_Solution.backend_pfe.repos.ArticleRepository;
import com.Rama_Solution.serviceImpl.ArticleInterface;

@Service
public class ArticleServiceImpl implements ArticleInterface {
	@Autowired
	ArticleRepository articleRepository;
	
	@Override
	public Article addArticle(Article art) {
		return articleRepository.save(art);
	}

	@Override
	public List<Article> findAllArticles() {
		return articleRepository.findAll();
	}

	@Override
	public Article findArticleById(Long id) {
		return articleRepository.findById(id).get();
	}

	@Override
	public void deleteArticleById(Long id) {
		articleRepository.deleteById(id);
	}

	@Override
	public Article updateArticle(Article art) {
		return articleRepository.save(art);
	}

}
