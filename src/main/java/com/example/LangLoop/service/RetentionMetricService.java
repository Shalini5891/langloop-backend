package com.example.LangLoop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.LangLoop.entity.RetentionMetric;
import com.example.LangLoop.repository.RetentionMetricRepository;

@Service
public class RetentionMetricService {

    @Autowired
    private RetentionMetricRepository repo;

    public RetentionMetric save(RetentionMetric r) {
        return repo.save(r);
    }

    public List<RetentionMetric> getAll() {
        return repo.findAll();
    }

    public RetentionMetric getById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Retention Metric not found"));
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}