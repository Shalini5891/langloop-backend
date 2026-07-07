package com.example.LangLoop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.LangLoop.entity.FlashCard;
import com.example.LangLoop.repository.FlashCardRepository;

import java.util.List;

@Service
public class FlashCardService {

    @Autowired
    private FlashCardRepository repo;

      public FlashCard saveMethod(FlashCard flashCard) {
        return repo.save(flashCard);
    }

    public List<FlashCard> getAll() {
        return repo.findAll();
    }


    public void delete(Long id) {
        repo.deleteById(id);
    }

    public Object getById(Long id) {
     return repo.findById(id)
            .orElseThrow(() -> new RuntimeException("FlashCard not found with id: " + id));    
    
    }
}