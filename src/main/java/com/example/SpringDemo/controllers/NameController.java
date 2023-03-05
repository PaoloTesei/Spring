package com.example.SpringDemo.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class NameController {

    @GetMapping("/name")
    public String getName() {
        return "Paolo";
    }

    @PostMapping("/name")
    public String getReversedName(@RequestBody String name) {
        StringBuilder reversedName = new StringBuilder(name);
        return reversedName.reverse().toString();
    }
}
