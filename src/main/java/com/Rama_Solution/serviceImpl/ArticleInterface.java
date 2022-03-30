package com.Rama_Solution.serviceImpl;

import java.util.List;

import com.Rama_Solution.backend_pfe.entities.Article;

public interface ArticleInterface {
	Article addArticle(Article art);
	List<Article> findAllArticles();
	Article findArticleById(Long id);
	void deleteArticleById(Long id);
	Article updateArticle(Article art);
}
