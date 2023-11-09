package com.example.mygratiude;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Optional;

public class Entry {
    private String titel;
    private String content;
    private LocalDate date;

    private Mood mood;
    private Kategory kategory;

    public Entry(String titel, String content, Optional<Mood> mood, Optional<Kategory> kategory){
        this.content = content;
        this.titel = titel;
        this.mood = mood.orElseGet();
    }
}
