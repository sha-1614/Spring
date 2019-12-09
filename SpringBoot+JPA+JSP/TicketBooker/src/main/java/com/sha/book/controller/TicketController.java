package com.sha.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.sha.book.model.Ticket;
import com.sha.book.service.TicketService;

@RestController
public class TicketController {

	@Autowired
	TicketService ticketService;

	@GetMapping(value = "/ticket/{id}")
	public ModelAndView getTicket(@PathVariable Long id, ModelAndView model) {
		Ticket ticket = ticketService.getTicket(id);
		model.setViewName("ticket_view");
		model.addObject("ticket", ticket);
		System.out.println("Entered into controller....!");
		return model;
	}
}
