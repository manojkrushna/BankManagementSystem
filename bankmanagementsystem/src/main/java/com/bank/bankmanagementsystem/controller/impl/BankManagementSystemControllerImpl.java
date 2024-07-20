package com.bank.bankmanagementsystem.controller.impl;

import com.bank.bankmanagementsystem.controller.BankManagementSystemController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/bank/v1")
public class BankManagementSystemControllerImpl implements BankManagementSystemController {

    @Override
    @GetMapping()
    public String getBank(){
        return "Welcome to Bank 1.0";
    }
}
