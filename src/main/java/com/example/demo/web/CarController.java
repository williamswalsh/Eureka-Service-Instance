package com.example.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CarController {

    @GetMapping("/car")
    public String getCar() {
        return "Lambo";
    }
}
