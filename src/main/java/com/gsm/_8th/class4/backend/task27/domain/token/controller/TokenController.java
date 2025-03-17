package com.gsm._8th.class4.backend.task27.domain.token.controller;

import com.gsm._8th.class4.backend.task27.domain.token.dto.Token;
import com.gsm._8th.class4.backend.task27.domain.token.dto.request.CreateTokenRequest;
import com.gsm._8th.class4.backend.task27.domain.token.service.CreateTokenService;
import com.gsm._8th.class4.backend.task27.domain.token.service.GetAllTokenService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/token")
@RequiredArgsConstructor
public class TokenController {

    private final GetAllTokenService getAllTokenService;
    private final CreateTokenService createTokenService;

    @GetMapping("/all")
    public ResponseEntity<List<Token>> getAllToken() {
        return ResponseEntity.status(HttpStatus.OK).body(getAllTokenService.getAllToken());
    }

    @PostMapping
    public ResponseEntity<Void> createToken(@Valid @RequestBody CreateTokenRequest request) {
        createTokenService.execute(request.token(), request.email());
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}