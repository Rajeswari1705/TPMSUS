package com.example.userservice.repository;

import com.example.userservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository  // Marks this as a database repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);  // Retrieves user details based on email
}
