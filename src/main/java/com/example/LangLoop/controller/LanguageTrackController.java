package com.example.LangLoop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.LangLoop.entity.LanguageTrack;
import com.example.LangLoop.service.LanguageTrackService;

import java.util.List;

@RestController
@RequestMapping("/api/language-track")
public class LanguageTrackController {

    @Autowired
    private LanguageTrackService service;

    @PostMapping
    public ResponseEntity<LanguageTrack> create(@RequestBody LanguageTrack t) {
        return ResponseEntity.ok(service.save(t));
    }

    @GetMapping
    public ResponseEntity<List<LanguageTrack>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<LanguageTrack> getById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.ok("Deleted");
    }
}