package com.aa.microservice3gateway.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aa.microservice3gateway.model.User;

public interface IUserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);

    org.springframework.boot.autoconfigure.security.SecurityProperties.User save(
            org.springframework.boot.autoconfigure.security.SecurityProperties.User user);
}
