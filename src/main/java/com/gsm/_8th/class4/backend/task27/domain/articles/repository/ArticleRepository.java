package com.gsm._8th.class4.backend.task27.domain.articles.repository;

import com.gsm._8th.class4.backend.task27.domain.articles.entity.ArticleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends JpaRepository<ArticleEntity, Long> {
}