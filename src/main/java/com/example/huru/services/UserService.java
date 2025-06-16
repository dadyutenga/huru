package com.example.huru.services;

import com.example.huru.models.User;
import java.util.List;
import java.util.Optional;

public interface UserService {
    User createUser(User user);
    User updateUser(User user);
    void deleteUser(Long userId);
    Optional<User> getUserById(Long id);
    Optional<User> getUserByUsername(String username);
    List<User> getAllUsers();
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
}