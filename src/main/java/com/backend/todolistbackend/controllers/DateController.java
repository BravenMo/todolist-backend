package com.backend.todolistbackend.controllers;

import com.backend.todolistbackend.services.DateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.DayOfWeek;
import java.util.Map;

@RestController
@RequestMapping("/date")
public class DateController {

    @Autowired
    private DateService service;

    @GetMapping
    public ResponseEntity<Map<String, String>> getCurrentWeekStart() {
        return new ResponseEntity<>(service.getCurrentWeekStart(), HttpStatus.OK);
    }
}

