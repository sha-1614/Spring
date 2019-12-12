package com.sha.book.dao;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.sha.book.model.Ticket;

@Repository
@EntityScan(basePackages = "com.sha.book.model")
public interface TicketRepository extends CrudRepository<Ticket, Long> {

}
