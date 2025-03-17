package com.gsm._8th.class4.backend.task27.domain.token.service.impl;

import com.gsm._8th.class4.backend.task27.domain.token.entity.TokenEntity;
import com.gsm._8th.class4.backend.task27.domain.token.repository.TokenRepository;
import com.gsm._8th.class4.backend.task27.domain.token.service.CreateTokenService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

@Service
@RequiredArgsConstructor
public class CreateTokenServiceImpl implements CreateTokenService {

    private final TokenRepository tokenRepository;

    @Override
    public void execute(String token, String email) {
        long ttl = ThreadLocalRandom.current().nextLong(180, 3600 + 1);
        tokenRepository.save(TokenEntity.builder()
                .token(token)
                .email(email)
                .description("This is stored redis token")
                .ttl(ttl)
                .build()
        );
    }
}
