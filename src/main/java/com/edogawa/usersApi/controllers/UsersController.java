package com.edogawa.usersApi.controllers;

import com.edogawa.usersApi.dtos.requests.AuthUserRequest;
import com.edogawa.usersApi.dtos.requests.CreateUserRequest;
import com.edogawa.usersApi.repositories.UserRepository;
import com.edogawa.usersApi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
public class UsersController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @PostMapping("create")
    public ResponseEntity<?> createUser(@RequestBody CreateUserRequest request) {
        return ResponseEntity.ok(userService.createUser(request));
    }

    @PostMapping("authenticate")
    public ResponseEntity<?> authenticate(@RequestBody AuthUserRequest request) {
        return ResponseEntity.ok(userService.authenticateUser(request));
    }


}
