package com.edogawa.usersApi.services;

import com.edogawa.usersApi.dtos.requests.AuthUserRequest;
import com.edogawa.usersApi.dtos.requests.CreateUserRequest;
import com.edogawa.usersApi.dtos.responses.AuthUserResponse;
import com.edogawa.usersApi.dtos.responses.CreateUserResponse;
import com.edogawa.usersApi.entities.User;
import com.edogawa.usersApi.repositories.PerfilRepository;
import com.edogawa.usersApi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PerfilRepository perfilRepository;

    public CreateUserResponse createUser(CreateUserRequest request) {

        var user = new User();

        user.setName(request.name());
        user.setEmail(request.email());
        user.setPassword(request.password());
        user.setCreatedHourAt(LocalDateTime.now());

        user.setPerfil(perfilRepository.findByName("Operator"));

        userRepository.save(user);

        return new CreateUserResponse(
                user.getId(),
                user.getName(),
                user.getEmail(),
                user.getPerfil().getName(),
                user.getCreatedHourAt()
        );


    }

    public AuthUserResponse authenticateUser(AuthUserRequest authUserRequest) {

        //TODO
        return null;
    }

}
