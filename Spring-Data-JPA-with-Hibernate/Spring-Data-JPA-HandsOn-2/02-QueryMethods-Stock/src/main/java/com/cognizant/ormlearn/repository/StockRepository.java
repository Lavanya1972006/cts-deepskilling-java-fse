package com.cognizant.ormlearn.repository;

import com.cognizant.ormlearn.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface StockRepository extends JpaRepository<Stock, Integer> {

    // Facebook stocks in September 2019
    List<Stock> findByCodeAndDateBetween(
            String code,
            LocalDate startDate,
            LocalDate endDate
    );


    // Google stocks whose close price is greater than 1250
    List<Stock> findByCodeAndCloseGreaterThan(
            String code,
            double close
    );


    // Top 3 highest transaction volume
    List<Stock> findTop3ByOrderByVolumeDesc();


    // Lowest 3 Netflix stocks
    List<Stock> findTop3ByCodeOrderByCloseAsc(
            String code
    );
}