package com.sha.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.sha.book.model.Ticket;
import com.sha.book.service.BookService;

@RestController
public class BookController {

	@Autowired
	BookService book;

	@GetMapping(value = "/")
	public ModelAndView getHomePage(ModelAndView view) {
		view.setViewName("index");
		return view;
	}

	@PostMapping(value = "/book")
	public ModelAndView addBooking(@ModelAttribute Ticket ticket, ModelAndView view) {
		System.out.println("getBookingForm method called..!");
		view.setViewName("post_booking_view");
		return view;
	}

	@GetMapping(value = "/book")
	public ModelAndView getBookingForm(ModelAndView view) {
		System.out.println("getBookingForm method called..!");
		view.setViewName("ticketbooking_form");
		return view;
	}
}
