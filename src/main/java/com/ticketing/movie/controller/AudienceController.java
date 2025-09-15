package com.ticketing.movie.controller;

import com.ticketing.movie.domain.Audience;
import com.ticketing.movie.domain.Ticket;
import com.ticketing.movie.service.UserTicketColService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/audience")
public class AudienceController {

    UserTicketColService userTicketColService;

    public AudienceController(UserTicketColService userTicketColService) {
        this.userTicketColService = userTicketColService;
    }

    @PostMapping("/addTicket/{userName}/{ticketId}")
    public Audience addTicketToUser(@PathVariable String userName, @PathVariable Long ticketId) {
        return userTicketColService.addTicketsToUser(ticketId, userName);
    }
}
