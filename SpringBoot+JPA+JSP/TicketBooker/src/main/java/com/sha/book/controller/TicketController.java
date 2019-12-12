package com.sha.book.controller;

import java.util.Arrays;
import java.util.List;

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
	public ModelAndView getTicket(@PathVariable Long id) {
		Ticket ticket = ticketService.getTicket(id);
		return new ModelAndView("ticket_view", "ticketList", Arrays.asList(ticket));
	}

	@GetMapping(value = "/ticket")
	public ModelAndView getAllTickets(ModelAndView model) {
		List<Ticket> ticketList = ticketService.getAllTickets();
		System.out.println("ticketList size:" + ticketList.size());
		return new ModelAndView("ticket_view", "ticketList", ticketList);
	}
}
