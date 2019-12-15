package com.java.ticketbook.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.ticketbook.dao.TicketRepository;
import com.java.ticketbook.model.Ticket;

@Service
public class TicketService {

	@Autowired
	TicketRepository ticketRepo;

	public Ticket getTicket(Long id) {
		Ticket ticket = null;
		Optional<Ticket> findById = ticketRepo.findById(id);
		if (findById.isPresent())
			ticket = findById.get();
		return ticket;
	}

	public List<Ticket> getAllTickets() {
		List<Ticket> ticket = new ArrayList<Ticket>();
		Iterable<Ticket> findAll = ticketRepo.findAll();
		findAll.forEach(k -> ticket.add(k));
		return ticket;
	}

}
