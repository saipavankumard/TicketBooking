package com.ticketing.movie.domain;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
@Getter
@EqualsAndHashCode
@Entity
public class Watcher {

    @Id
    @GeneratedValue
    @Column(name = "watcher_id")
    private Long id;

    @OneToMany(mappedBy = "watcher")
    private final List<Ticket> tickets;

    private final String name;

    private final int phoneNumber;

    public Watcher() {
        this.tickets = null;
        this.name = null;
        this.phoneNumber = 0;
    }
}
