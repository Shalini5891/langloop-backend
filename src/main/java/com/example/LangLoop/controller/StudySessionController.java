package com.example.LangLoop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.LangLoop.entity.StudySession;
import com.example.LangLoop.service.StudySessionService;

import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/sessions")
public class StudySessionController {

    @Autowired
    private StudySessionService service;

    @PostMapping
    public ResponseEntity<StudySession> create(@RequestBody StudySession s) {
        return ResponseEntity.ok(service.save(s));
    }

    @GetMapping
    public ResponseEntity<List<StudySession>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.ok("Deleted");
    }
}