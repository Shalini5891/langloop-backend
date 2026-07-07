package com.example.LangLoop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.LangLoop.entity.StudyDeck;
import com.example.LangLoop.repository.StudyDeckRepository;

@Service
public class StudyDeckService {

    @Autowired
    private StudyDeckRepository repo;

    public StudyDeck save(StudyDeck d) {
        return repo.save(d);
    }

    public List<StudyDeck> getAll() {
        return repo.findAll();
    }

    public StudyDeck getById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Not found"));
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}