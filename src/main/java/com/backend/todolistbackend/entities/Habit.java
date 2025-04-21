package com.backend.todolistbackend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Habit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String habitName;
    private boolean mondayCompleted;
    private boolean tuesdayCompleted;
    private boolean wednesdayCompleted;
    private boolean thursdayCompleted;
    private boolean fridayCompleted;
    private boolean saturdayCompleted;
    private boolean sundayCompleted;
}