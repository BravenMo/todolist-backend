//package com.backend.todolistbackend.services;
//
//import com.backend.todolistbackend.entities.Note;
//import com.backend.todolistbackend.repositories.NoteRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class NoteService {
//
//    @Autowired
//    private NoteRepository repository;
//
//    public Note getNote(){
//        return repository.findById(1).get();
//    }
//
//    public Note updateNote(Note note){
//        Note tmp = repository.findById(1).get();
//        tmp.setContent(note.getContent());
//        repository.save(tmp);
//        return tmp;
//    }
//
//    public void deleteAll(){
//        Note tmp = repository.findById(1).get();
//        tmp.setContent("");
//        repository.save(tmp);
//    }
//}
