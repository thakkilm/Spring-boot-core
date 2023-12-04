package com.mahesh.springboot.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements Coach {
    @Override
    public String getDailyWorkOut() {
        return "Practice Base Ball daily for atleast 31 minutes";
    }
}
