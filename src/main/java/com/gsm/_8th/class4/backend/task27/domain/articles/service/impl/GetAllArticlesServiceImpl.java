package com.gsm._8th.class4.backend.task27.domain.articles.service.impl;

import com.gsm._8th.class4.backend.task27.domain.articles.dto.Article;
import com.gsm._8th.class4.backend.task27.domain.articles.entity.ArticleEntity;
import com.gsm._8th.class4.backend.task27.domain.articles.repository.ArticleRepository;
import com.gsm._8th.class4.backend.task27.domain.articles.service.GetAllArticlesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GetAllArticlesServiceImpl implements GetAllArticlesService {

    private final ArticleRepository articleRepository;

    @Override
    public List<Article> execute() {
        return articleRepository.findAll().stream()
                .map(ArticleEntity::toDto)
                .toList();
    }
}