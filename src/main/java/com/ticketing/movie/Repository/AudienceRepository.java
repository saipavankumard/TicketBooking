package com.ticketing.movie.Repository;

import com.ticketing.movie.domain.Audience;
import org.springframework.data.repository.CrudRepository;

public interface AudienceRepository extends CrudRepository<Audience, Long> {
    Audience findByUserName(String userName);
}
