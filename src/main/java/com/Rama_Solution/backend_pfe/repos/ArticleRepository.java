package com.Rama_Solution.backend_pfe.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Rama_Solution.backend_pfe.entities.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> {

	//findArticleByCatégorie
}
