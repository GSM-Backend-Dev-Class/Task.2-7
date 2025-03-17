package com.gsm._8th.class4.backend.task27.domain.token.entity;

import com.gsm._8th.class4.backend.task27.domain.token.dto.Token;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.TimeToLive;
import org.springframework.data.redis.core.index.Indexed;

import java.util.concurrent.TimeUnit;

@RedisHash("token")
@NoArgsConstructor
@Getter
public class TokenEntity {
    @Id
    private String token;
    @Indexed
    private String email;
    private String description;
    @TimeToLive(unit = TimeUnit.SECONDS)
    private Long ttl;

    @Builder
    public TokenEntity(String token, String email, String description, Long ttl) {
        this.token = token;
        this.email = email;
        this.description = description;
        this.ttl = ttl;
    }

    public Token toDto() {
        return new Token(token, email, description, ttl);
    }
}