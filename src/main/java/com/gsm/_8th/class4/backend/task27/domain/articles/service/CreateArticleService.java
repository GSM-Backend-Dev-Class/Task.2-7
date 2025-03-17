package com.gsm._8th.class4.backend.task27.domain.articles.service;

public interface CreateArticleService {
    void execute(String title, String description, String content, String author);
}