package com.cognizant.ormlearn.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "stock")
public class Stock {

    @Id
    private int id;

    private String code;

    private LocalDate date;

    private double open;

    private double close;

    private double volume;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }


    public double getOpen() {
        return open;
    }

    public void setOpen(double open) {
        this.open = open;
    }


    public double getClose() {
        return close;
    }

    public void setClose(double close) {
        this.close = close;
    }


    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }


    @Override
    public String toString() {
        return "Stock{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", date=" + date +
                ", open=" + open +
                ", close=" + close +
                ", volume=" + volume +
                '}';
    }
}