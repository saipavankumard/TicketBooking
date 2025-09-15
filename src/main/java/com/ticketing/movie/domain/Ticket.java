package com.ticketing.movie.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
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
    private final Long movieId;
    private final String seatNumber;

    // Empty constructor for JPA
    protected Ticket() {
        this.userId = null;
        this.movieId = null;
        this.seatNumber = null;
    }
}
