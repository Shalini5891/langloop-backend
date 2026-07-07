package com.example.LangLoop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.LangLoop.entity.LanguageTrack;

public interface LanguageTrackRepository extends JpaRepository<LanguageTrack, Long> {}