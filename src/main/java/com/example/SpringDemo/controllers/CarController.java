package com.example.SpringDemo.controllers;

import com.example.SpringDemo.DTO.CarDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/cars")
public class CarController {

    @GetMapping
    public ResponseEntity<CarDTO> getCar() {
        CarDTO car = new CarDTO();
        car.setId("123AV");
        car.setModelName("Alfa Romeo");
        car.setPrice(30000.55);

        return ResponseEntity.ok(car);
    }

    @PostMapping
    public ResponseEntity<String> postCar(@Valid @RequestBody CarDTO carDTO) {
        System.out.println(carDTO);
        return new ResponseEntity<>("Car created!", HttpStatus.CREATED);
    }
}

