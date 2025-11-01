package com.edogawa.usersApi.dtos.requests;

public record AuthUserRequest(
        String email,
        String password
) {
}
