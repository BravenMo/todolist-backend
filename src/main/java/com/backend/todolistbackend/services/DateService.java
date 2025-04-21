package com.backend.todolistbackend.services;

import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;

@Service
public class DateService {

    public Map<String, String> getCurrentWeekStart() {
        LocalDate today = LocalDate.now();
        LocalDate pastMonday = today.with(DayOfWeek.MONDAY);
        String formattedDate = pastMonday.format(DateTimeFormatter.ofPattern("MMMM d"));
        return Map.of("weekStart", formattedDate);
    }
}
