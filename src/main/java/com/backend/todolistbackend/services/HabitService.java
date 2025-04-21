//package com.backend.todolistbackend.services;
//
//import com.backend.todolistbackend.entities.Goal;
//import com.backend.todolistbackend.entities.Habit;
//import com.backend.todolistbackend.repositories.HabitRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//public class HabitService {
//
//    @Autowired
//    private HabitRepository repository;
//
//    public List<Habit> getAllHabits(){
//        return repository.findAll();
//    }
//
//    public Habit addHabit(Habit habit){
//        return repository.save(habit);
//    }
//
//    public void deleteHabit(int id){
//        repository.delete(repository.findById(id).get());
//    }
//
//    public Habit checkHabitForMonday(int habitID, boolean checked){
//        Habit found = repository.findById(habitID).get();
//        found.setMondayCompleted(checked);
//        return repository.save(found);
//    }
//
//    public Habit checkHabitForTuesday(int habitID, boolean checked){
//        Habit found = repository.findById(habitID).get();
//        found.setTuesdayCompleted(checked);
//        return repository.save(found);
//    }
//
//    public Habit checkHabitForWednesday(int habitID, boolean checked){
//        Habit found = repository.findById(habitID).get();
//        found.setWednesdayCompleted(checked);
//        return repository.save(found);
//    }
//
//    public Habit checkHabitForThursday(int habitID, boolean checked){
//        Habit found = repository.findById(habitID).get();
//        found.setThursdayCompleted(checked);
//        return repository.save(found);
//    }
//
//    public Habit checkHabitForFriday(int habitID, boolean checked){
//        Habit found = repository.findById(habitID).get();
//        found.setFridayCompleted(checked);
//        return repository.save(found);
//    }
//
//    public Habit checkHabitForSaturday(int habitID, boolean checked){
//        Habit found = repository.findById(habitID).get();
//        found.setSaturdayCompleted(checked);
//        return repository.save(found);
//    }
//
//    public Habit checkHabitForSunday(int habitID, boolean checked){
//        Habit found = repository.findById(habitID).get();
//        found.setSundayCompleted(checked);
//        return repository.save(found);
//    }
//
//    public void deleteAll(){
//        repository.deleteAll();
//    }
//
//    public int numberOfHabitsCompleted(){
//        int completed = 0;
//        List<Habit> allHabits = repository.findAll();
//        for(Habit currHabit:allHabits){
//            if(currHabit.isMondayCompleted() && currHabit.isTuesdayCompleted() && currHabit.isWednesdayCompleted()
//            && currHabit.isThursdayCompleted() && currHabit.isFridayCompleted() && currHabit.isSaturdayCompleted() && currHabit.isSundayCompleted()){
//                completed++;
//            }
//        }
//        return completed;
//    }
//
//    public List<String> allHabitsMissed(){
//        List<String> missedHabits = new ArrayList<String>();
//        List<Habit> allHabits = repository.findAll();
//        for(Habit currHabit:allHabits){
//            String text = "";
//            if(currHabit.isMondayCompleted() && currHabit.isTuesdayCompleted() && currHabit.isWednesdayCompleted()
//                    && currHabit.isThursdayCompleted() && currHabit.isFridayCompleted() && currHabit.isSaturdayCompleted() && currHabit.isSundayCompleted()){
//                continue;
//            }
//            else{
//                text = text+currHabit.getHabitName()+" was missed out on: ";
//                if(!currHabit.isMondayCompleted()){
//                    text=text+"Monday ";
//                }
//                if(!currHabit.isTuesdayCompleted()){
//                    text=text+"Tuesday ";
//                }
//                if(!currHabit.isWednesdayCompleted()){
//                    text=text+"Wednesday ";
//                }
//                if(!currHabit.isThursdayCompleted()){
//                    text=text+"Thursday ";
//                }
//                if(!currHabit.isFridayCompleted()){
//                    text=text+"Friday ";
//                }
//                if(!currHabit.isSaturdayCompleted()){
//                    text=text+"Saturday ";
//                }
//                if(!currHabit.isSundayCompleted()){
//                    text=text+"Sunday ";
//                }
//            }
//            missedHabits.add(text);
//        }
//        return missedHabits;
//    }
//}
