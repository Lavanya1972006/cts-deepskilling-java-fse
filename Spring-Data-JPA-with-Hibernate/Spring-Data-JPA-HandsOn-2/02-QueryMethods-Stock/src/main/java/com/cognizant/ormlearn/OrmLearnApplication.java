package com.cognizant.ormlearn;

import com.cognizant.ormlearn.model.Stock;
import com.cognizant.ormlearn.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

    @Autowired
    private StockService stockService;

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

        // 1. Facebook stocks in September 2019
        List<Stock> facebookStocks = stockService.getFacebookStocks();
        System.out.println("Facebook Stocks in September 2019:");
        facebookStocks.forEach(System.out::println);


        // 2. Google stocks close > 1250
        List<Stock> googleStocks = stockService.getGoogleStocks();
        System.out.println("Google Stocks close greater than 1250:");
        googleStocks.forEach(System.out::println);


        // 3. Top 3 highest volume stocks
        List<Stock> topVolumeStocks = stockService.getTop3VolumeStocks();
        System.out.println("Top 3 Highest Volume Stocks:");
        topVolumeStocks.forEach(System.out::println);


        // 4. Lowest 3 Netflix stocks
        List<Stock> netflixStocks = stockService.getLowest3NetflixStocks();
        System.out.println("Lowest 3 Netflix Stocks:");
        netflixStocks.forEach(System.out::println);
    }
}