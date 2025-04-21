//package com.backend.todolistbackend.controllers;
//
//import com.backend.todolistbackend.services.ProgressService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/progress")
//public class ProgressController {
//
//    @Autowired
//    private ProgressService progressService;
//
//    @GetMapping
//    public ResponseEntity<Float> getProgress(){
//        return new ResponseEntity<>(progressService.getProgress(), HttpStatus.OK);
//    }
//
//    @GetMapping("/full")
//    public ResponseEntity<Boolean> checkIfFull(){
//        return new ResponseEntity<>(progressService.isFull(),HttpStatus.OK);
//    }
//}
