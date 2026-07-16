package com.cognizant;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThirdPartyController {

    @GetMapping("/payment")
    public String payment() throws Exception {

        // Simulate a slow third-party API
        Thread.sleep(5000);

        return "Payment Successful";

    }

}