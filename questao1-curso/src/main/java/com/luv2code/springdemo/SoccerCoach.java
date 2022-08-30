package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;

public class SoccerCoach implements Coach {
    @Override
    @Bean
    public String getDailyWorkout() {
        return "Run around the School";
    }

    @Override
    public String getDailyFortune() {
        return "Do what you have to do! ";
    }
}
