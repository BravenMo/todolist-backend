package com.backend.todolistbackend.controllers;

import com.backend.todolistbackend.entities.Note;
import com.backend.todolistbackend.services.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/note")
public class NoteController {

    @Autowired
    private NoteService service;

    @GetMapping
    public ResponseEntity<Note> getNote(){
        return new ResponseEntity<>(service.getNote(), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Note> updateNote(@RequestBody Note note){
        return new ResponseEntity<>(service.updateNote(note),HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteAll(){
        service.deleteAll();
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
