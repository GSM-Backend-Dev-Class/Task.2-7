package com.gsm._8th.class4.backend.task27.domain.token.repository;

import com.gsm._8th.class4.backend.task27.domain.token.entity.TokenEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TokenRepository extends CrudRepository<TokenEntity, Long> {
}