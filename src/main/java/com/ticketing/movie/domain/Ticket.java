package com.ticketing.movie.domain;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
@Entity
public class Ticket {

    @Id
    @GeneratedValue
    private Long id;
    private final Long userId;

    @ManyToOne
    private final Movie movie;
    private final String seatNumber;

    // Empty constructor for JPA
    protected Ticket() {
        this.userId = null;
        this.movie = null;
        this.seatNumber = null;
    }
}
