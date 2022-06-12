package com.aa.microservice3gateway.service;

import java.util.List;
import java.util.Optional;

import com.aa.microservice3gateway.model.User;

public interface IUserService {
    User saveUser(User user);
    
    Optional<User> findByUsername(String username);

    List<User> findAllUsers();
}
