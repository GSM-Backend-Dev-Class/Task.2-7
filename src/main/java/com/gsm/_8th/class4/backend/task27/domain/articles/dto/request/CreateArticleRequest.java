package com.gsm._8th.class4.backend.task27.domain.articles.dto.request;

import jakarta.validation.constraints.NotNull;

public record CreateArticleRequest(
        @NotNull
        String title,
        @NotNull
        String description,
        @NotNull
        String content,
        @NotNull
        String author
) {
}