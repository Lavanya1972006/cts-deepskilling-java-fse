package com.cognizant.ormlearn.repository;

import com.cognizant.ormlearn.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

    // Search countries containing the given text and sort by name
    List<Country> findByNameContainingIgnoreCaseOrderByNameAsc(String text);

    // Search countries starting with the given alphabet
    List<Country> findByNameStartingWithIgnoreCase(String alphabet);

}