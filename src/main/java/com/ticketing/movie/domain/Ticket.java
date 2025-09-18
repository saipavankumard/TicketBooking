package com.ticketing.movie.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
    @JsonIgnoreProperties("tickets")
    private Watcher watcher;

    public Ticket() {
        this.movieName = null;
        this.showTime = null;
        this.seatNumber = null;
        this.watcher = null;
    }
}
