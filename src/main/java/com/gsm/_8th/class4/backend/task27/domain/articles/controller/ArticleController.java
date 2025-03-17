package com.gsm._8th.class4.backend.task27.domain.articles.controller;

import com.gsm._8th.class4.backend.task27.domain.articles.dto.Article;
import com.gsm._8th.class4.backend.task27.domain.articles.dto.request.CreateArticleRequest;
import com.gsm._8th.class4.backend.task27.domain.articles.service.CreateArticleService;
import com.gsm._8th.class4.backend.task27.domain.articles.service.GetAllArticlesService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/articles")
@RequiredArgsConstructor
public class ArticleController {

    private final GetAllArticlesService getAllArticlesService;
    private final CreateArticleService createArticleService;

    @GetMapping("/all")
    public ResponseEntity<List<Article>> getAllArticles() {
        return ResponseEntity.status(HttpStatus.OK).body(getAllArticlesService.execute());
    }

    @PostMapping
    public ResponseEntity<Void> createArticle(@Valid @RequestBody CreateArticleRequest request) {
        createArticleService.execute(request.title(), request.description(), request.content(), request.author());
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}