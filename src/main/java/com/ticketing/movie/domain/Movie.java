package com.ticketing.movie.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@RequiredArgsConstructor
@EqualsAndHashCode
@ToString
@Getter
public class Movie {
    @Id
    @GeneratedValue
    @Column(name = "MOVIE_ID")
    private Long id;

    private final String title;
    private final String genre;
    private final int duration; // duration in minutes

    // Empty constructor for JPA
    protected Movie() {
        this.title = null;
        this.genre = null;
        this.duration = 0;
    }
}
