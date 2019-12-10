package com.sha.book.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sha.book.dao.TicketRepository;
import com.sha.book.model.Ticket;

@Service
public class BookService {

	@Autowired
	TicketRepository ticketRepo;

	public void bookTicket(Ticket ticket) {
		Ticket save = ticketRepo.save(ticket);
		System.out.println("saved ticket id" + ticket.getId());
	}

}
