package com.mahesh.springboot.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements Coach {
    public  BaseBallCoach(){
        System.out.println("Instructor :"+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkOut() {
        return "Practice Base Ball daily for atleast 31 minutes";
    }
}
