package com.edogawa.usersApi.dtos.responses;

import java.time.LocalDateTime;
import java.util.UUID;

public record CreateUserResponse(
        UUID id,
        String name,
        String email,
        String perfil,
        LocalDateTime dateHourAccess
) {
}
