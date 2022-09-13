package com.luv2code.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {
    Random rd = new Random();
    @Override
    public String getFortune() {
        int a;
        a = rd.nextInt(3);

        String[] arr = {"Today is your Lucky Day", "Lets train","Its a beautiful day"};
        return arr[a];
    }
}
