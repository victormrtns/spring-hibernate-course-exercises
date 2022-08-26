package com.luv2code.springdemo;


import org.springframework.context.annotation.Bean;

public class BaseballCoach implements Coach {
    @Override
    @Bean
    public String getDailyWorkout(){
        return "Spend 30 minutes on batting practice";
    }
}
