package com.spring.javaPlusAnnotation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Service
public class Greetings {
    @Autowired
    public LocalTime localTime;

    public Greetings(){
        System.out.println(" Greetings bean created!");
    }

    public String generategreetings(String name){
        int hour = localTime.getHour();
        if (hour<12) return "Good Morning "+name;
        else if (hour<16) return "Good Afternoon "+name;
        else if (hour<20) return "Good Evening "+name;
        else return "Good Night "+name;


    }
}