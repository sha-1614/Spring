package com.java.ticketbooking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserAccountController {

	@PostMapping(value = "/signup")
	public String userSignUp() {
		return "";
	}
}
