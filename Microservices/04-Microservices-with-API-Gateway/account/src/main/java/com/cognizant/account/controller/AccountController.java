package com.cognizant.account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.account.client.LoanClient;
import com.cognizant.account.model.Account;
import com.cognizant.account.model.Loan;
import com.cognizant.account.service.AccountService;



@RestController
public class AccountController {


    @Autowired
    private AccountService accountService;


    @Autowired
    private LoanClient loanClient;



    @GetMapping("/accounts/{number}")
    public Account getAccount(@PathVariable String number) {


        Account account = accountService.getAccount(number);


        Loan loan = loanClient.getLoan(number);


        account.setLoan(loan);


        return account;

    }

}