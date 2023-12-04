package com.mahesh.springboot.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkOut() {
        return "Practice Batting daily for atleast 30 minutes";
    }
}
