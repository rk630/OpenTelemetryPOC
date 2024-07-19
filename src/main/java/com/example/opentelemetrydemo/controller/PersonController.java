package com.example.opentelemetrydemo.controller;

import com.example.opentelemetrydemo.model.Person;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/person")
public class PersonController {

    @PostMapping("/add")
    public Person addPerson(@RequestBody Person person) {
        // You can add code here to save the person details to a database
        // For simplicity, we'll just return the person object
        return person;
    }
}
