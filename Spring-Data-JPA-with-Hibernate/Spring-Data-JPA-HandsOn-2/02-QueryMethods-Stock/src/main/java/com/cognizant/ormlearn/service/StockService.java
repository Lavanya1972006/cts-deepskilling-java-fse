package com.cognizant.ormlearn.service;

import com.cognizant.ormlearn.model.Stock;
import com.cognizant.ormlearn.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StockService {

    @Autowired
    private StockRepository stockRepository;


    // Facebook stocks in September 2019
    public List<Stock> getFacebookStocks() {
        return stockRepository.findByCodeAndDateBetween(
                "FB",
                LocalDate.of(2019, 9, 1),
                LocalDate.of(2019, 9, 30)
        );
    }


    // Google stocks close price greater than 1250
    public List<Stock> getGoogleStocks() {
        return stockRepository.findByCodeAndCloseGreaterThan(
                "GOOG",
                1250
        );
    }


    // Top 3 highest volume stocks
    public List<Stock> getTop3VolumeStocks() {
        return stockRepository.findTop3ByOrderByVolumeDesc();
    }


    // Lowest 3 Netflix stocks
    public List<Stock> getLowest3NetflixStocks() {
        return stockRepository.findTop3ByCodeOrderByCloseAsc(
                "NFLX"
        );
    }
}