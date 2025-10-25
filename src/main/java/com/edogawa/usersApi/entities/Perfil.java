package com.edogawa.usersApi.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name = "tb_profiles")
public class Perfil {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")

    private UUID id;

    @Column(name = "name", length = 25, nullable = false, unique = true)
    private String name;

    @OneToMany(mappedBy = "perfil")
    private List<User> users;


}
