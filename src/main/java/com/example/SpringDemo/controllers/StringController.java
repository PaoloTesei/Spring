package com.example.SpringDemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//required = false se il parametro è opzionale//
@RestController
public class StringController {
    @GetMapping("/strings")
    public String concatenationString(@RequestParam String first, @RequestParam(required = false) String second){
        if (second == null) {
            return first;
        }
        else return first+second;
    }
}
