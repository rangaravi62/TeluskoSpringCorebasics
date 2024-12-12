package com.spring.beans;

public class Devops implements ICourse{

    public Devops(){
        System.out.println("Devops bean has been created!");
    }

    @Override
    public Boolean getTheCourse(Double amount) {
        System.out.println("Devops course cost -> "+amount);
        return true;
    }
}
