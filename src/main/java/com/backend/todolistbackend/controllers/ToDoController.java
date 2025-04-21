package com.backend.todolistbackend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToDoController {

    @GetMapping("/")
    public String healthCheck(){
        return "Spring Boot App is working";
    }
}
