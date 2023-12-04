package com.mahesh.springboot.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {
    @Override
    public String getDailyWorkOut() {
        return "Practice Running daily for atleast 35 minutes";
    }
}
