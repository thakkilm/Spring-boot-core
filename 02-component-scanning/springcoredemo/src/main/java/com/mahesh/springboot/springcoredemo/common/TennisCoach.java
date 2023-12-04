package com.mahesh.springboot.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    @Override
    public String getDailyWorkOut() {
        return "Practice Tennis daily for atleast 5 minutes";
    }
}
