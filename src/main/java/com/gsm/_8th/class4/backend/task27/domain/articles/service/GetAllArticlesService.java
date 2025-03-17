package com.gsm._8th.class4.backend.task27.domain.articles.service;

import com.gsm._8th.class4.backend.task27.domain.articles.dto.Article;

import java.util.List;

public interface GetAllArticlesService {
    List<Article> execute();
}