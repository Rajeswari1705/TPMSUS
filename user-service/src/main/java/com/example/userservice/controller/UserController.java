package com.example.userservice.controller;

import com.example.userservice.entity.User;
import com.example.userservice.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController  // Marks this class as a REST controller
@RequestMapping("/users")  // Base URL for user-related API endpoints
public class UserController {
    private final UserService userService;

    // Constructor-based dependency injection
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // GET request to retrieve all users
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    // GET request to retrieve a user by email
    @GetMapping("/{email}")
    public User getUserByEmail(@PathVariable String email) {
        return userService.getUserByEmail(email);
    }

    // POST request to create a new user
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }
}
