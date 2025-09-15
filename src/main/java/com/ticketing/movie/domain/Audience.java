package com.ticketing.movie.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor   // JPA needs this
@AllArgsConstructor  // Convenience constructor
@ToString
@EqualsAndHashCode
public class Audience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // AUTO or IDENTITY works with H2
    private Long id;


}
