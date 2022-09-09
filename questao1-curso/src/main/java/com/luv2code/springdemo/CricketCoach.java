package com.luv2code.springdemo;

public class CricketCoach implements Coach{
    private FortuneService fortuneService;
    //create a no arg constructor
    public CricketCoach() {
        System.out.println("Cricket Coach: inside no-arg constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
        System.out.println("Cricket Coach: inside setter method - setFortuneService ");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast Bowling for 15 minutes a day";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
