package com.example.LangLoop.entity;

import jakarta.persistence.*;

@Entity
public class RetentionMetric {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int score;
    private String date;

    public RetentionMetric() {
    }

    public RetentionMetric(Long id, int score, String date) {
        this.id = id;
        this.score = score;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}