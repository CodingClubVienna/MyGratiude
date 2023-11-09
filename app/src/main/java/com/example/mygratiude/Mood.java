package com.example.mygratiude;

import java.util.logging.Logger;

public enum Mood {

    RELAXED("relaxed"),
    NEUTRAL ("neutral"),
    STRESSED ("stressed"),
    HAPPY("happy"),
    SAD("sad"),
    CONFUSED("confused");
    private String description;
    private static final Logger logger = Logger.getLogger(Mood.class.getName());
    private Mood(String description) {
        this.description = description;
    }

    public Mood getEnumValueOf(String description){
        Mood mood = null;
        switch(description){
            case "relaxed":{
                mood= RELAXED;
                break;
            }
            case "neutral":{
                mood = NEUTRAL;
                break;
            }
            case "happy":{
                mood = HAPPY;
                break;
            }
            case "sad":{
                mood =  SAD;
                break;
            }
            case "confused":{
                mood = CONFUSED;
                break;
            }
            default:{
                logger.warning("No such enum found: " + description);
                break;
            }
        }
        return mood;
    }

    public String getStringOfMood(Mood mood){
        String description = null;
        switch (mood){
            case RELAXED:{
                description = "relaxed";
                break;
            }
            case NEUTRAL:{
                description = "neutral";
                break;
            }
            case HAPPY:{
                description="happy";
                break;
            }
            case SAD:{
                description="sad";
                break;
            }
            case CONFUSED:{
                description = "confused";
                break;
            }
            default:{
                logger.warning("No such enum found: " + description);
                break;
            }
        }
        return description;
    }
}
