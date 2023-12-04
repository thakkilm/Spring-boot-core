package com.mahesh.springboot.springcoredemo.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class SwimCoach implements Coach{


    @Override
    public String getDailyWorkOut() {
        return "Implemented using @Bean annotation";
    }
}
