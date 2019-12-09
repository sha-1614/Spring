package com.sha.book.service;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sha.book.dao.TicketRepository;
import com.sha.book.model.Ticket;

@Service
public class TicketService {

	@Autowired
	TicketRepository ticketRepo;

	public Ticket getTicket(Long id) {
		Ticket ticket = null;
		saveTickets();
		Optional<Ticket> findById = ticketRepo.findById(id);
		if (findById.isPresent())
			ticket = findById.get();
		return ticket;
	}

	public void saveTickets() {
		System.out.println("Data stored...!");
		Ticket ticket = new Ticket();
		ticket.setId(1L);
		ticket.setName("Shagul");
		ticket.setSource("Chennai");
		ticket.setDestination("Bangalore");
		ticket.setBookingDate(new Date("10/12/2019"));
		ticketRepo.save(ticket);
	}

}
