package com.ticketing.movie.service;

import com.ticketing.movie.Repository.AudienceRepository;
import com.ticketing.movie.Repository.TicketRepository;
import com.ticketing.movie.domain.Audience;
import com.ticketing.movie.domain.Ticket;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserTicketColServiceImpl implements UserTicketColService{

    AudienceRepository audienceRepository;
    TicketRepository ticketRepository;

    public UserTicketColServiceImpl(AudienceRepository audienceRepository, TicketRepository ticketRepository) {
        this.audienceRepository = audienceRepository;
        this.ticketRepository = ticketRepository;
    }

    @Override
    public Audience addTicketsToUser(Long ticketId, String userName) {
        Ticket ticket = ticketRepository.findById(ticketId).orElse(null);
        if(ticket == null){
            throw new RuntimeException("Ticket not found");
        }
        Audience audience = audienceRepository.findByUserName(userName);
        if(audience == null){
           audience = new Audience();
           audience.setUserName(userName);
           audience.setUserTickets(new ArrayList<>());
        }
        audience.getUserTickets().add(ticket);

        return audienceRepository.save(audience);
    }
}
