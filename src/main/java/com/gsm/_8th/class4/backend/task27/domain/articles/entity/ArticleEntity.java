package com.gsm._8th.class4.backend.task27.domain.articles.entity;

import com.gsm._8th.class4.backend.task27.domain.articles.dto.Article;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "articles")
@Getter
@NoArgsConstructor
public class ArticleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "article_id")
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
    @Column(name = "content")
    private String content;
    @Column(name = "author")
    private String author;
    @Column(name = "created_date")
    private LocalDateTime createdAt;

    @Builder
    public ArticleEntity(Long id, String title, String description, String content, String author, LocalDateTime createdAt) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.content = content;
        this.author = author;
        this.createdAt = createdAt;
    }

    public Article toDto() {
        return new Article(id, title, description, content, author, createdAt);
    }
}