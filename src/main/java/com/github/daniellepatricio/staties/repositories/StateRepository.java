package com.github.daniellepatricio.staties.repositories;

import com.github.daniellepatricio.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
