package com.java.ticketbooking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserAccountController {

	@GetMapping(value = "/")
	public String userSignUp() {
		return "home";
	}

	@GetMapping(value = "/login")
	public String userLogin() {
		return "login";
	}
	
	@GetMapping(value = "/logout")
	public String userLogout() {
		return "logout";
	}
}
