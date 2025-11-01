package com.edogawa.usersApi.repositories;

import com.edogawa.usersApi.entities.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PerfilRepository extends JpaRepository<Perfil, UUID> {

    // Using JPQL to find a profile by name
    @Query("""
            SELECT p FROM Perfil p
            WHERE p.name = :name
            """)
    Perfil findByName(@Param("name") String name);
}
