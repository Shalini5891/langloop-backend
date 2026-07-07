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

import com.example.LangLoop.entity.StudyDeck;
import com.example.LangLoop.service.StudyDeckService;

import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/decks")
public class StudyDeckController {

    @Autowired
    private StudyDeckService service;

    @PostMapping
    public ResponseEntity<StudyDeck> create(@RequestBody StudyDeck d) {
        return ResponseEntity.ok(service.save(d));
    }

    @GetMapping
    public ResponseEntity<List<StudyDeck>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.ok("Deleted");
    }
}