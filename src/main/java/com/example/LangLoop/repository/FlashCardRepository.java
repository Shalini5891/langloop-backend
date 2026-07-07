package com.example.LangLoop.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.LangLoop.entity.FlashCard;

public interface FlashCardRepository extends JpaRepository<FlashCard, Long> {

    
}