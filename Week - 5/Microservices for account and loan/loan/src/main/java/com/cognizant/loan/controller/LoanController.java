package com.cognizant.loan.controller;

import org.springframework.web.bind.annotation.*;
import com.cognizant.loan.model.Loan;

@RestController
@RequestMapping("/loans")
public class LoanController {

    @GetMapping("/{number}")
    public Loan getLoan(@PathVariable String number) {
        return new Loan(number, "car", 400000L, 3258, 18);
    }
}
