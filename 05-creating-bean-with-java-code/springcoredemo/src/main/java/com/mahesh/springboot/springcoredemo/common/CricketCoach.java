package com.mahesh.springboot.springcoredemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
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
