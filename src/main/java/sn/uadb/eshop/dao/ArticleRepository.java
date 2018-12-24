package sn.uadb.eshop.dao;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sn.uadb.eshop.entities.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> {
	
	@Query("select a from Article a where a.titre like :x")
	public Page<Article> findarticles(@Param("x")String mc, Pageable pageable);

}
