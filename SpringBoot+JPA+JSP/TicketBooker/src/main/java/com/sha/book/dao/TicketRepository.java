package com.sha.book.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sha.book.model.Ticket;

@Repository
public interface TicketRepository extends CrudRepository<Ticket, Long> {

}
