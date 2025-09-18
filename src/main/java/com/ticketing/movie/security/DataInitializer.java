package com.ticketing.movie.security;

import com.ticketing.movie.Repository.AppUserRepository;
import com.ticketing.movie.domain.AppUser;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class DataInitializer {
    @Bean
    CommandLineRunner initUsers(AppUserRepository userRepo, PasswordEncoder passwordEncoder){
        return args -> {
            if (userRepo.findByUsername("testuser").isEmpty()) {
                AppUser user = new AppUser();
                user.setUsername("testuser");
                user.setPassword(passwordEncoder.encode("testpass"));
                user.setRole("USER");
                userRepo.save(user);

                System.out.println("✅ Test user created: testuser / testpass");
            }
        };
    }
}
