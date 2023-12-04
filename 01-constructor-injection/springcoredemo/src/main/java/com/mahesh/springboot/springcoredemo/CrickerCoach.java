package com.mahesh.springboot.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class CrickerCoach implements Coach {
    @Override
    public String getDailyWorkOut() {
        return "Practice Batting daily for atleast 30 minutes";
    }
}
