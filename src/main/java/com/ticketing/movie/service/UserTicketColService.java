package com.ticketing.movie.service;

import com.ticketing.movie.domain.Audience;
import com.ticketing.movie.domain.Ticket;

public interface UserTicketColService {
    public Audience addTicketsToUser(Long ticketId, String userName);
}
