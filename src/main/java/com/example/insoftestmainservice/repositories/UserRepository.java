package com.example.insoftestmainservice.repositories;


import com.example.insoftestmainservice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByName(String username);
}
