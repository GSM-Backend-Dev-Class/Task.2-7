package com.gsm._8th.class4.backend.task27.domain.token.service.impl;

import com.gsm._8th.class4.backend.task27.domain.token.dto.Token;
import com.gsm._8th.class4.backend.task27.domain.token.entity.TokenEntity;
import com.gsm._8th.class4.backend.task27.domain.token.repository.TokenRepository;
import com.gsm._8th.class4.backend.task27.domain.token.service.GetAllTokenService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@RequiredArgsConstructor
public class GetAllTokenServiceImpl implements GetAllTokenService {

    private final TokenRepository tokenRepository;

    @Override
    public List<Token> getAllToken() {
        Iterable<TokenEntity> iterable = tokenRepository.findAll();
        return StreamSupport.stream(iterable.spliterator(), false)
                .filter(Objects::nonNull)
                .map(TokenEntity::toDto)
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }
}