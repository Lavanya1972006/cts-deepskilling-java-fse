package com.cognizant.loan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.loan.model.Loan;
import com.cognizant.loan.service.LoanService;

@RestController
public class LoanController {

    @Autowired
    private LoanService loanService;

    @GetMapping("/loans/{number}")
    public Loan getLoan(@PathVariable String number) {
        return loanService.getLoan(number);
    }

}