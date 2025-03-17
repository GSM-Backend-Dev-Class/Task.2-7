package com.gsm._8th.class4.backend.task27.domain.articles.dto;

import com.gsm._8th.class4.backend.task27.domain.articles.entity.ArticleEntity;

import java.time.LocalDateTime;

public record Article(
        Long id,
        String title,
        String description,
        String content,
        String author,
        LocalDateTime createdAt
) {
    public ArticleEntity toEntity() {
        return ArticleEntity.builder()
                .id(id)
                .title(title)
                .description(description)
                .content(content)
                .author(author)
                .createdAt(createdAt)
                .build();
    }
}