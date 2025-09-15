package com.ticketing.movie.service;

import com.ticketing.movie.Repository.TicketRepository;
import com.ticketing.movie.Repository.WatcherRepository;
import com.ticketing.movie.domain.Ticket;
import com.ticketing.movie.domain.Watcher;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {

    private final TicketRepository ticketRepository;
    private final WatcherRepository watcherRepository;

    public BookingServiceImpl(TicketRepository ticketRepository, WatcherRepository watcherRepository) {
        this.watcherRepository = watcherRepository;
        this.ticketRepository = ticketRepository;
    }

    @Override
    public void bookTicket(Ticket ticket, Watcher watcher) {
        ticket.setWatcher(watcher);
    }

    @Override
    public List<Ticket> getTicketDetailsofWatcher(String userName) {

        Watcher watcher = watcherRepository.findByName(userName);
        if(watcher != null) {
            return watcher.getTickets();
        }
        return new ArrayList<>();

    }

    @Override
    public List<Ticket> getAllTickets() {
        return (List<Ticket>) ticketRepository.findAll();
    }
}
