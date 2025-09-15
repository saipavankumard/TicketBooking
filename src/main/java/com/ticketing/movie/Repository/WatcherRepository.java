package com.ticketing.movie.Repository;

import com.ticketing.movie.domain.Watcher;
import org.springframework.data.repository.CrudRepository;

public interface WatcherRepository extends CrudRepository<Watcher, Long> {
    Watcher findByName(String userName);
}
