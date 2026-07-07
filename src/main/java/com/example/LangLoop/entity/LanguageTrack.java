package com.example.LangLoop.entity;

import jakarta.persistence.*;

@Entity
public class LanguageTrack {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String languageName;
    private int progress;

    public LanguageTrack() {}

    public LanguageTrack(Long id, String languageName, int progress) {
        this.id = id;
        this.languageName = languageName;
        this.progress = progress;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getLanguageName() { return languageName; }
    public void setLanguageName(String languageName) { this.languageName = languageName; }

    public int getProgress() { return progress; }
    public void setProgress(int progress) { this.progress = progress; }
}