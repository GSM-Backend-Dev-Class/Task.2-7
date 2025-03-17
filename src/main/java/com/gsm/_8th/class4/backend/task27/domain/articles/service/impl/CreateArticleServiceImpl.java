package com.gsm._8th.class4.backend.task27.domain.articles.service.impl;

import com.gsm._8th.class4.backend.task27.domain.articles.entity.ArticleEntity;
import com.gsm._8th.class4.backend.task27.domain.articles.repository.ArticleRepository;
import com.gsm._8th.class4.backend.task27.domain.articles.service.CreateArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateArticleServiceImpl implements CreateArticleService {

    private final ArticleRepository articleRepository;

    @Override
    public void execute(String title, String description, String content, String author) {
        articleRepository.save(
                ArticleEntity.builder()
                        .title(title)
                        .description(description)
                        .content(content)
                        .author(author)
                        .build()
        );
    }
}