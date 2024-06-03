package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sharing")
public class MyController {

    @GetMapping("/add")
    public String getMessage() {
        return "I am here";
    }
}
