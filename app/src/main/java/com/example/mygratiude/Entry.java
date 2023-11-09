package com.example.mygratiude;

import java.time.LocalDate;
import java.util.Optional;
import java.util.logging.Logger;

public class Entry {
    static final Logger logger = Logger.getLogger(Entry.class.getName());
    private String titel;
    private String content;
    private LocalDate date;

    private Mood mood;
    private Optional<Kategory> kategory;

    public Entry(String titel, String content, Optional<Mood> mood, Optional<Kategory> kategory){
        this.content = content;
        this.titel = titel;
        this.mood = mood.orElse(Mood.NEUTRAL);
        this.kategory = kategory;
    }

    public Mood getMood(){
        return mood;
    }
    public Optional<Kategory> getKategory(){
        return kategory;
    }
    public String getTitel(){
        return titel;
    }
    public String getContent(){
        return content;
    }
    public LocalDate getDate(){
        return date;
    }

}
