package com.java.ticketbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.ticketbooking.model.User;

public interface AuthenticationRepository extends JpaRepository<User, Integer> {

	public User findByUsername(String username);
}
