package com.mahesh.springboot.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkOut() {
        return "Practice Batting daily for atleast 35 minutes";
    }
}
