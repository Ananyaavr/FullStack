package com.jobapp.ananyaa.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jobapp.ananyaa.model.User;

public interface UserRepository extends JpaRepository<User, String>{

    Optional<User> findByEmail(String email);

} 
