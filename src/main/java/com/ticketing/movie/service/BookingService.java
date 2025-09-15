package com.ticketing.movie.service;

import com.ticketing.movie.domain.Ticket;;import java.util.List;

public interface BookingService {
    void bookTicket(Ticket ticket);
    List<Ticket> getTicketDetails();
}
