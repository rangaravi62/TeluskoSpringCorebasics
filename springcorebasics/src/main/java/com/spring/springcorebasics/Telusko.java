package com.spring.springcorebasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class Telusko {

    @Autowired
    @Qualifier("devops")
    public ICourse course;

    public Telusko(){
        System.out.println("Telusko bean has been created!");
    }

    public Telusko(ICourse course) {
        System.out.println("Telusko Constructor injection");
        this.course = course;
    }

    public void setCourse(ICourse course){
        System.out.println("Telusko Setter injection");
        this.course = course;
    }

    public boolean buyCourse(double amount){
        return course.getTheCourse(amount);
    }
}
