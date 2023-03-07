package com.example.SpringDemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FactorialController {

    @GetMapping("/factorial/{n}")
    public int getFactorial(@PathVariable int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

}