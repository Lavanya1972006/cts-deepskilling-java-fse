package com.cognizant.ormlearn;

import com.cognizant.ormlearn.model.Stock;
import com.cognizant.ormlearn.service.StockService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class OrmLearnApplicationTests {

    @Autowired
    private StockService stockService;


    @Test
    public void testFacebookStocks() {

        List<Stock> stocks = stockService.getFacebookStocks();

        stocks.forEach(System.out::println);
    }


    @Test
    public void testGoogleStocks() {

        List<Stock> stocks = stockService.getGoogleStocks();

        stocks.forEach(System.out::println);
    }


    @Test
    public void testTopVolumeStocks() {

        List<Stock> stocks = stockService.getTop3VolumeStocks();

        stocks.forEach(System.out::println);
    }


    @Test
    public void testLowestNetflixStocks() {

        List<Stock> stocks = stockService.getLowest3NetflixStocks();

        stocks.forEach(System.out::println);
    }
}