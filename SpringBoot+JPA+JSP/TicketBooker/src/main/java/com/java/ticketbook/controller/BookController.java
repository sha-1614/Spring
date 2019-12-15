package com.java.ticketbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.java.ticketbook.model.Ticket;
import com.java.ticketbook.service.BookService;

@Controller
public class BookController {

	@Autowired
	BookService book;

	@GetMapping(value = "/")
	public String getHomePage(ModelAndView view) {
		return "index";
	}

	@PostMapping(value = "/book")
	public String addBooking(@ModelAttribute Ticket ticket,Model model) {
		System.out.println("addBooking method called..!");
		book.bookTicket(ticket);
		return "redirect:/ticket";
	}

	@GetMapping(value = "/book")
	public String getBookingForm(ModelAndView view) {
		return "ticketbooking_form";
	}
}
