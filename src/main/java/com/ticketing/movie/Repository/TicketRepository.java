package com.ticketing.movie.Repository;

import com.ticketing.movie.domain.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Ticket, Long> {

    
}
