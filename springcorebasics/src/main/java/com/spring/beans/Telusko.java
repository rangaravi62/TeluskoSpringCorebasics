package com.spring.beans;

public class Telusko {
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
