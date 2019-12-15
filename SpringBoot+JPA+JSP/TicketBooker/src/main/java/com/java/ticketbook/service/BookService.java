package com.java.ticketbook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.ticketbook.dao.TicketRepository;
import com.java.ticketbook.model.Ticket;

@Service
public class BookService {

	@Autowired
	TicketRepository ticketRepo;

	public void bookTicket(Ticket ticket) {
		Ticket save = ticketRepo.save(ticket);
		System.out.println("saved ticket id" + ticket.getId());
	}

}
