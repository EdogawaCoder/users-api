package com.edogawa.usersApi.dtos.requests;

public record CreateUserRequest (
        String name,
        String email,
        String password
){

}
