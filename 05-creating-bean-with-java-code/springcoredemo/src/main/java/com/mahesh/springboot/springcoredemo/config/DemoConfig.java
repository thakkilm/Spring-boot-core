package com.mahesh.springboot.springcoredemo.config;

import com.mahesh.springboot.springcoredemo.common.Coach;
import com.mahesh.springboot.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoConfig {

    @Bean
    public Coach swimCoach()
    {
        return new SwimCoach();
    }


}
