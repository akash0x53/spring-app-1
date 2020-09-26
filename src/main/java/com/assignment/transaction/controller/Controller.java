package com.assignment.transaction.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller
 */

@RestController
@RequestMapping("/assignment")
public class Controller {

    @GetMapping("/transaction/{id}")
    public String getTransaction(@PathVariable String id) {
        return new String("Transaction id " + id);
    }

    @GetMapping("/transactionSummaryByProducts/{days}")
    public String getTransactionSummaryByProducts(@PathVariable int days) {
        return "Days = " + days;
    }

    @GetMapping("/transactionSummaryByManufacturingCity/{days}")
    public String getTransactionSummaryByManfCity(@PathVariable int days) {
        return "Days Mnf City="+days;
    }
    
}
