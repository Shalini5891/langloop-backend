package com.example.LangLoop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.LangLoop.entity.LanguageTrack;
import com.example.LangLoop.repository.LanguageTrackRepository;

import java.util.List;

@Service
public class LanguageTrackService {

    @Autowired
    private LanguageTrackRepository repo;

    public LanguageTrack save(LanguageTrack t) {
        return repo.save(t);
    }

    public List<LanguageTrack> getAll() {
        return repo.findAll();
    }

    public LanguageTrack getById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Not found"));
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}