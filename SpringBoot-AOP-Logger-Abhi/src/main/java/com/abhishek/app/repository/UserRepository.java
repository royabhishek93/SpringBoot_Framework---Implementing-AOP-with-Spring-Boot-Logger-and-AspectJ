package com.abhishek.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhishek.app.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
}
