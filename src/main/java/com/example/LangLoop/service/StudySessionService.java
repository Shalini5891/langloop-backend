package com.example.LangLoop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.LangLoop.entity.StudySession;
import com.example.LangLoop.repository.StudySessionRepository;

@Service
public class StudySessionService {

    @Autowired
    private StudySessionRepository repo;

    public StudySession save(StudySession s) {
        return repo.save(s);
    }

    public List<StudySession> getAll() {
        return repo.findAll();
    }

    public StudySession getById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Not found"));
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}