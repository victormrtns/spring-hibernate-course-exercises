package com.luv2code.springdemo;


import org.springframework.context.annotation.Bean;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;
    public BaseballCoach(FortuneService ThefortuneService) {
        fortuneService = ThefortuneService;
    }

    @Override
    @Bean
    public String getDailyWorkout(){
        return "Spend 30 minutes on batting practice";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
