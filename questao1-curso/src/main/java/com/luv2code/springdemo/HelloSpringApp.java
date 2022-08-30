package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        //carregar o spring configuration file
        //criar um spring container
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //Criar o Bean
        //Passar a interface pro método
        Coach theCoach = context.getBean("Coach",Coach.class);
        Coach theCoach1 = context.getBean("Coach1",Coach.class);

        //Chamar os métodos do bean específico
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach1.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        context.close();
    }
}
