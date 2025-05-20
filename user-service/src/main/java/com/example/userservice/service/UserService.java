package com.example.userservice.service;

import com.example.userservice.entity.User;
import com.example.userservice.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service  // Defines this as a Spring service component
public class UserService {
    private final UserRepository userRepository;

    // Constructor-based dependency injection
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Retrieves all registered users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Fetches a specific user by email
    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    // Creates a new user (ensure password hashing before storing)
    public User createUser(User user) {
        return userRepository.save(user);
    }
}
