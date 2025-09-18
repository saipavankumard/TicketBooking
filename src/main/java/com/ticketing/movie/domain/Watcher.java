package com.ticketing.movie.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@EqualsAndHashCode
@Entity
@Setter
public class Watcher {

    @Id
    @GeneratedValue
    @Column(name = "watcher_id")
    private Long id;

    private String name;
    private int phoneNumber;

    @OneToMany(mappedBy = "watcher", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Ticket> tickets = new ArrayList<>();


    public Watcher(String name, int phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

}
