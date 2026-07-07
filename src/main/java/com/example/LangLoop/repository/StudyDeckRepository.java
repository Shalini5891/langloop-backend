package com.example.LangLoop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.LangLoop.entity.StudyDeck;

public interface StudyDeckRepository extends JpaRepository<StudyDeck, Long> {}