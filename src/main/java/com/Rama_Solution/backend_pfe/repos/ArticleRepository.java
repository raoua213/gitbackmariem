package com.Rama_Solution.backend_pfe.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Rama_Solution.backend_pfe.entities.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> {

	//findArticleByCat├ęgorie
	@Query("Select art From Article art Where art.categorie= :cat")
	List<Article> findArticleByCat├ęgorie(@Param("cat") String cat);
}
