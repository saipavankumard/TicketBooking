package com.ticketing.movie.domain;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Getter
@EqualsAndHashCode
@Entity
@Setter
public class Watcher {

    @Id
    @GeneratedValue
    @Column(name = "watcher_id")
    private Long id;

    @OneToMany(mappedBy = "watcher", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Ticket> tickets = new ArrayList<>();

    private final String name;

    private final int phoneNumber;

    public Watcher() {
        this.tickets = null;
        this.name = null;
        this.phoneNumber = 0;
    }
}
