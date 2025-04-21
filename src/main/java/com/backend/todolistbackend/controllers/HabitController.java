package com.backend.todolistbackend.controllers;

import com.backend.todolistbackend.entities.Goal;
import com.backend.todolistbackend.entities.Habit;
import com.backend.todolistbackend.services.GoalService;
import com.backend.todolistbackend.services.HabitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/habits")
public class HabitController {

    @Autowired
    private HabitService service;

    @GetMapping
    public ResponseEntity<List<Habit>> getAllGoals(){
        return new ResponseEntity<>(service.getAllHabits(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Habit> addHabit(@RequestBody Habit habit){
        return new ResponseEntity<>(service.addHabit(habit),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHabits(@PathVariable int id){
        service.deleteHabit(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/monday/{id}/{checked}")
    public ResponseEntity<Habit> updateHabitForMonday(@PathVariable int id,@PathVariable boolean checked){
        return new ResponseEntity<>(service.checkHabitForMonday(id,checked),HttpStatus.OK);
    }

    @PutMapping("/tuesday/{id}/{checked}")
    public ResponseEntity<Habit> updateHabitForTuesday(@PathVariable int id,@PathVariable boolean checked){
        return new ResponseEntity<>(service.checkHabitForTuesday(id,checked),HttpStatus.OK);
    }

    @PutMapping("/wednesday/{id}/{checked}")
    public ResponseEntity<Habit> updateHabitForWednesday(@PathVariable int id,@PathVariable boolean checked){
        return new ResponseEntity<>(service.checkHabitForWednesday(id,checked),HttpStatus.OK);
    }

    @PutMapping("/thursday/{id}/{checked}")
    public ResponseEntity<Habit> updateHabitForThursday(@PathVariable int id,@PathVariable boolean checked){
        return new ResponseEntity<>(service.checkHabitForThursday(id,checked),HttpStatus.OK);
    }

    @PutMapping("/friday/{id}/{checked}")
    public ResponseEntity<Habit> updateHabitForFriday(@PathVariable int id,@PathVariable boolean checked){
        return new ResponseEntity<>(service.checkHabitForFriday(id,checked),HttpStatus.OK);
    }

    @PutMapping("/saturday/{id}/{checked}")
    public ResponseEntity<Habit> updateHabitForSaturday(@PathVariable int id,@PathVariable boolean checked){
        return new ResponseEntity<>(service.checkHabitForSaturday(id,checked),HttpStatus.OK);
    }

    @PutMapping("/sunday/{id}/{checked}")
    public ResponseEntity<Habit> updateHabitForSunday(@PathVariable int id,@PathVariable boolean checked){
        return new ResponseEntity<>(service.checkHabitForSunday(id,checked),HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteAll(){
        service.deleteAll();
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/completed")
    public ResponseEntity<Integer> numberOfHabitsCompleted(){
        return new ResponseEntity<>(service.numberOfHabitsCompleted(),HttpStatus.OK);
    }

    @GetMapping("/missed")
    public ResponseEntity<List<String>> getAllMissedHabits(){
        return new ResponseEntity<>(service.allHabitsMissed(),HttpStatus.OK);
    }

}
