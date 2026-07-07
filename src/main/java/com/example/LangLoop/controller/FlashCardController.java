package com.example.LangLoop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.LangLoop.entity.FlashCard;
import com.example.LangLoop.service.FlashCardService;


@RestController
@RequestMapping("/flashcards")
public class FlashCardController {

    @Autowired
    private FlashCardService service;

    @PostMapping
    public ResponseEntity<Object> create(@RequestBody FlashCard flashCard) {
        return ResponseEntity.ok(service.saveMethod(flashCard));
    }

    @GetMapping("/getAll")
    public ResponseEntity<Object> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Object> getById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.ok("Deleted");
    }
}