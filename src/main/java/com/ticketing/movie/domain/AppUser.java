package com.ticketing.movie.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Entity
public class AppUser {
    @Id
    @GeneratedValue
    private Long id;

    private String username;
    private String password;
    private String role; // e.g., ROLE_USER, ROLE_ADMIN

}
