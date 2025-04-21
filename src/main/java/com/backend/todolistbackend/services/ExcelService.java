//package com.backend.todolistbackend.services;
//
//import com.backend.todolistbackend.entities.Goal;
//import com.backend.todolistbackend.entities.Habit;
//import com.backend.todolistbackend.entities.Note;
//import com.backend.todolistbackend.repositories.GoalRepository;
//import com.backend.todolistbackend.repositories.HabitRepository;
//import com.backend.todolistbackend.repositories.NoteRepository;
//import jakarta.servlet.ServletOutputStream;
//import jakarta.servlet.http.HttpServletResponse;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.io.IOException;
//import java.util.List;
//
//@Service
//public class ExcelService {
//
//    @Autowired
//    private GoalRepository goalRepository;
//
//    @Autowired
//    private HabitRepository habitRepository;
//
//    @Autowired
//    private NoteRepository noteRepository;
//
//    public void generateExcel(HttpServletResponse response) throws IOException{
//        Workbook workbook = new XSSFWorkbook();
//
//        Sheet goalSheet = workbook.createSheet("Goals");
//        Sheet habitSheet = workbook.createSheet("Habits");
//        Sheet noteSheet  = workbook.createSheet("Notes");
//
//        List<Goal> goals = goalRepository.findAll();
//        List<Habit> habits = habitRepository.findAll();
//        Note note = noteRepository.findById(1).get();
//
//        writeGoalsSheet(goalSheet, goals);
//        writeHabitsSheet(habitSheet, habits);
//        writeNoteSheet(noteSheet, note);
//
//        response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
//        response.setHeader("Content-Disposition", "attachment; filename=database_export.xlsx");
//
//        ServletOutputStream outputStream = response.getOutputStream();
//        workbook.write(outputStream);
//        workbook.close();
//        outputStream.close();
//    }
//
//    private void writeGoalsSheet(Sheet sheet, List<Goal> goals) {
//        Row headerRow = sheet.createRow(0);
//        headerRow.createCell(0).setCellValue("ID");
//        headerRow.createCell(1).setCellValue("Name");
//        headerRow.createCell(2).setCellValue("Completed");
//
//        int rowIdx = 1;
//        for (Goal goal : goals) {
//            Row row = sheet.createRow(rowIdx++);
//            row.createCell(0).setCellValue(goal.getId());
//            row.createCell(1).setCellValue(goal.getGoalName());
//            row.createCell(2).setCellValue(goal.isCompleted());
//        }
//    }
//
//    private void writeHabitsSheet(Sheet sheet, List<Habit> habits) {
//        Row headerRow = sheet.createRow(0);
//        headerRow.createCell(0).setCellValue("ID");
//        headerRow.createCell(1).setCellValue("Name");
//        headerRow.createCell(2).setCellValue("Monday");
//        headerRow.createCell(3).setCellValue("Tuesday");
//        headerRow.createCell(4).setCellValue("Wednesday");
//        headerRow.createCell(5).setCellValue("Thursday");
//        headerRow.createCell(6).setCellValue("Friday");
//        headerRow.createCell(7).setCellValue("Saturday");
//        headerRow.createCell(8).setCellValue("Sunday");
//
//
//        int rowIdx = 1;
//        for (Habit habit : habits) {
//            Row row = sheet.createRow(rowIdx++);
//            row.createCell(0).setCellValue(habit.getId());
//            row.createCell(1).setCellValue(habit.getHabitName());
//            row.createCell(2).setCellValue(habit.isMondayCompleted());
//            row.createCell(3).setCellValue(habit.isTuesdayCompleted());
//            row.createCell(4).setCellValue(habit.isWednesdayCompleted());
//            row.createCell(5).setCellValue(habit.isThursdayCompleted());
//            row.createCell(6).setCellValue(habit.isFridayCompleted());
//            row.createCell(7).setCellValue(habit.isSaturdayCompleted());
//            row.createCell(8).setCellValue(habit.isSundayCompleted());
//        }
//    }
//
//    private void writeNoteSheet(Sheet sheet, Note note) {
//        Row headerRow = sheet.createRow(0);
//        headerRow.createCell(0).setCellValue("ID");
//        headerRow.createCell(1).setCellValue("Note");
//
//        Row row = sheet.createRow(1);
//        row.createCell(0).setCellValue(1);
//        row.createCell(1).setCellValue(note.getContent());
//    }
//}
