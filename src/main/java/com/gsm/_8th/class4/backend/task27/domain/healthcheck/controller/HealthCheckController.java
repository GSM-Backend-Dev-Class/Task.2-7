package com.gsm._8th.class4.backend.task27.domain.healthcheck.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthCheckController {

    @GetMapping("/check")
    public ResponseEntity<String> check() {
        return ResponseEntity.ok("OK");
    }
}