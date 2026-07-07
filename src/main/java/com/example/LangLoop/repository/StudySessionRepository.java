package com.example.LangLoop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.LangLoop.entity.StudySession;

public interface StudySessionRepository extends JpaRepository<StudySession, Long> {}