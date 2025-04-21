//package com.backend.todolistbackend.services;
//
//import com.backend.todolistbackend.entities.Goal;
//import com.backend.todolistbackend.repositories.GoalRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//public class GoalService {
//
//    @Autowired
//    private GoalRepository repository;
//
//    public List<Goal> getAllGoals(){
//        return repository.findAll();
//    }
//
//    public Goal addGoal(Goal goal){
//        return repository.save(goal);
//    }
//
//    public Goal checkGoal(int goalID, boolean checked){
//        Goal found = repository.findById(goalID).get();
//        found.setCompleted(checked);
//        return repository.save(found);
//    }
//
//    public void deleteGoal(int id){
//        repository.delete(repository.findById(id).get());
//    }
//
//    public void deleteAll(){
//        repository.deleteAll();
//    }
//
//    public int numberOfGoalsCompleted(){
//        int completed = 0;
//        List<Goal> allGoals = repository.findAll();
//        for(Goal currGoal:allGoals){
//            if(currGoal.isCompleted()){
//                completed++;
//            }
//        }
//        return completed;
//    }
//
//    public List<String> allGoalsMissed(){
//        List<String> missedGoals = new ArrayList<String>();
//        List<Goal> allGoals = repository.findAll();
//        for(Goal currGoal:allGoals){
//            if(!currGoal.isCompleted()){
//                missedGoals.add(currGoal.getGoalName());
//            }
//        }
//        return missedGoals;
//    }
//}
