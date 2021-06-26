package com.github.daniellepatricio.countries.repositories;

import com.github.daniellepatricio.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
