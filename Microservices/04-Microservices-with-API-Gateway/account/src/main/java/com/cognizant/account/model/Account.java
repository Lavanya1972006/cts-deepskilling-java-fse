package com.cognizant.account.model;


public class Account {


    private String number;

    private String type;

    private double balance;

    private Loan loan;



    public String getNumber() {
        return number;
    }


    public void setNumber(String number) {
        this.number = number;
    }



    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }



    public double getBalance() {
        return balance;
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }



    public Loan getLoan() {
        return loan;
    }


    public void setLoan(Loan loan) {
        this.loan = loan;
    }

}