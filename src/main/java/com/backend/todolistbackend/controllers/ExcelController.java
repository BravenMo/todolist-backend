package com.backend.todolistbackend.controllers;


import com.backend.todolistbackend.services.ExcelService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/excel")
public class ExcelController {

    @Autowired
    private ExcelService excelService;

    @GetMapping
    public void downloadExcel(HttpServletResponse response) throws IOException {
        excelService.generateExcel(response);
    }
}