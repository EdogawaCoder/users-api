package com.edogawa.usersApi.dtos.responses;

import java.time.LocalDateTime;
import java.util.UUID;

public record AuthUserResponse(
        UUID id,
        String name,
        String email,
        String perfil,
        LocalDateTime dateHourAccess,
        String accessToken
) {
}
