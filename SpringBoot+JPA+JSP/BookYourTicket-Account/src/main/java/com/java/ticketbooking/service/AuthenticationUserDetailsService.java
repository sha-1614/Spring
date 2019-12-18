package com.java.ticketbooking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.java.ticketbooking.AuthenticationUserDetails;
import com.java.ticketbooking.model.User;
import com.java.ticketbooking.repository.AuthenticationRepository;

@Service
public class AuthenticationUserDetailsService implements UserDetailsService {

	@Autowired
	AuthenticationRepository repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = repo.findByUsername(username);
		if (user == null)
			throw new UsernameNotFoundException("User not registered");
		return new AuthenticationUserDetails(user);
	}

}
