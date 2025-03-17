package com.gsm._8th.class4.backend.task27.domain.token.dto.request;

import jakarta.validation.constraints.NotNull;

public record CreateTokenRequest(
        @NotNull
        String token,
        @NotNull
        String email
) {
}