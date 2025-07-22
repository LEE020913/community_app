package com.metaverse.community_app.article.repository;

import com.metaverse.community_app.article.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
