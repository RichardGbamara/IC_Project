package com.example.model;

import java.time.LocalDate;

public class Holiday {
    private String name;
    private LocalDate date;

    public Holiday(String name, LocalDate date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }
}
