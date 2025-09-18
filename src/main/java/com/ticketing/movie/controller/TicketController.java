package com.ticketing.movie.controller;

import com.ticketing.movie.Repository.TicketRepository;
import com.ticketing.movie.domain.Ticket;
import com.ticketing.movie.domain.Watcher;
import com.ticketing.movie.service.BookingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tickets")
public class    TicketController {


    private final BookingService bookingService;

    public TicketController(TicketRepository ticketRepository, BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping("/book")
    public void bookTicket(@RequestBody Ticket ticket, @RequestParam String watcherName, @RequestParam int watcherPhoneNumber) {
        Watcher watcher = new Watcher(watcherName, watcherPhoneNumber);
        bookingService.bookTicket(ticket, watcher);
    }

    @GetMapping("/all")
    public List<Ticket> getAllTickets() {
        return bookingService.getAllTickets();
    }


    @GetMapping("/watcher/{userName}")
    public List<Ticket> getTicketsByWatcher(@PathVariable String userName) {
        return bookingService.getTicketDetailsofWatcher(userName);
    }
}
