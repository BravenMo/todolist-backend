package com.backend.todolistbackend.controllers;

import com.backend.todolistbackend.entities.Goal;
import com.backend.todolistbackend.services.GoalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class GoalController {

    @Autowired
    private GoalService service;

    @GetMapping
    public ResponseEntity<List<Goal>> getAllGoals(){
        return new ResponseEntity<>(service.getAllGoals(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Goal> addGoals(@RequestBody Goal goal){
        return new ResponseEntity<>(service.addGoal(goal),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGoals(@PathVariable int id){
        service.deleteGoal(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/{id}/{checked}")
    public ResponseEntity<Goal> updateGoal(@PathVariable int id,@PathVariable boolean checked){
        return new ResponseEntity<>(service.checkGoal(id,checked),HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteAll(){
        service.deleteAll();
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/completed")
    public ResponseEntity<Integer> numberOfGoalsCompleted(){
        return new ResponseEntity<>(service.numberOfGoalsCompleted(),HttpStatus.OK);
    }

    @GetMapping("/missed")
    public ResponseEntity<List<String>> getAllMissedGoals(){
        return new ResponseEntity<>(service.allGoalsMissed(),HttpStatus.OK);
    }
}
