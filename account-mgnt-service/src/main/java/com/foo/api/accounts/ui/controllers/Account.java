package com.foo.api.accounts.ui.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class Account {

    @GetMapping("/status/check")
    public String status() {
        return "Working";
    }

}
