package com.spring.xmlPlusAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class Telusko {
//    @Autowired
//    @Qualifier("devops")  // field injection
    public ICourse course;

    public Telusko(){
        System.out.println("Telusko bean has been created!");
    }

//    @Autowired
//    public Telusko(@Qualifier("devops") ICourse course) { // for constructor injection qualifier is used for local variables
    public Telusko(ICourse course) {
        System.out.println("Telusko Constructor injection");
        this.course = course;
    }

    @Autowired     //if we don't prioritize any of spring or devops it'll give NoUniqueBeanDefinitionException
    @Qualifier("devops")  // qualifier dominates over primary
    public void setCourse(ICourse course){
        System.out.println("Telusko Setter injection");
        this.course = course;
    }

    public boolean buyCourse(double amount){
        return course.getTheCourse(amount);
    }
}
