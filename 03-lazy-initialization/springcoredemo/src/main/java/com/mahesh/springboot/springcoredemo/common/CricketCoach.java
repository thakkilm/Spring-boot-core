package com.mahesh.springboot.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CricketCoach implements Coach {

    public  CricketCoach(){
        System.out.println("Instructor :"+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkOut() {
        return "Practice Batting daily for atleast 35 minutes";
    }
}
