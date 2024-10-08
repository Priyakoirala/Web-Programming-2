package com.example.webprogramming2.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.webprogramming2.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	User findByUsername(String username); // Add this method

}