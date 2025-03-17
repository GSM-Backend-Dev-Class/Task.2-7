package com.gsm._8th.class4.backend.task27.domain.token.dto;

import com.gsm._8th.class4.backend.task27.domain.token.entity.TokenEntity;

public record Token(
        String token,
        String email,
        String description,
        Long ttl
) {
    public TokenEntity toEntity() {
        return TokenEntity.builder()
                .token(token)
                .email(email)
                .description(description)
                .ttl(ttl)
                .build();
    }
}