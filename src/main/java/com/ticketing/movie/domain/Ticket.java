package com.ticketing.movie.domain;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@EqualsAndHashCode
@Entity
@Setter
public class Ticket {

    @Id
    @GeneratedValue
    @Column(name = "ticket_id")
    private Long id;

    private final String movieName;
    private final String showTime;
    private final String seatNumber;


    @ManyToOne
    @JoinColumn(name = "watcher_id")
    private Watcher watcher;

    public Ticket() {
        this.movieName = null;
        this.showTime = null;
        this.seatNumber = null;
        this.watcher = null;
    }
}
