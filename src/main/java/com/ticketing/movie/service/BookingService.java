package com.ticketing.movie.service;

import com.ticketing.movie.domain.Ticket;
import com.ticketing.movie.domain.Watcher;

import java.util.List;

public interface BookingService {
    void bookTicket(Ticket ticket, Watcher watcher);
    List<Ticket> getTicketDetailsofWatcher(String userName);
    List<Ticket> getAllTickets();
}
