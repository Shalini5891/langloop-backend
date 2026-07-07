package com.example.LangLoop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.LangLoop.entity.RetentionMetric;
import com.example.LangLoop.service.RetentionMetricService;

@RestController
@RequestMapping("/api/retention")
public class RetentionMetricController {

    @Autowired
    private RetentionMetricService service;

    @PostMapping
    public ResponseEntity<RetentionMetric> create(@RequestBody RetentionMetric r) {
        return ResponseEntity.ok(service.save(r));
    }

    @GetMapping
    public ResponseEntity<List<RetentionMetric>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<RetentionMetric> getById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.ok("Deleted Successfully");
    }
}