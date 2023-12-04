package com.mahesh.springboot.springcoredemo.rest;

import com.mahesh.springboot.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;
    @Autowired
    public DemoController(@Qualifier("tennisCoach") Coach myCoach){
        this.myCoach=myCoach;
    }
    @GetMapping("/daily-workout")
    public String getDailyWorkOut(){
        return myCoach.getDailyWorkOut();
    }
}
