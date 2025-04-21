//package com.backend.todolistbackend.services;
//
//import com.backend.todolistbackend.entities.Goal;
//import com.backend.todolistbackend.entities.Habit;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class ProgressService {
//
//    @Autowired
//    private GoalService goalService;
//
//    @Autowired
//    private HabitService habitService;
//
//    public float getProgress() {
//        return  ((float) (habitService.numberOfHabitsCompleted() + goalService.numberOfGoalsCompleted()) /(habitService.getAllHabits().size()+goalService.getAllGoals().size()));
//    }
//
//    public boolean isFull(){
//        return !habitService.getAllHabits().isEmpty() && !goalService.getAllGoals().isEmpty();
//    }
//}
