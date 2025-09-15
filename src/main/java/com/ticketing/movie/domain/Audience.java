package com.ticketing.movie.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

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

    private String userName;

    @OneToMany(mappedBy = "audience")
    private List<Ticket> userTickets;


}
