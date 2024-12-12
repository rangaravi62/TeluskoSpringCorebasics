package com.spring.beans;

public class Java implements ICourse {

    public Java(){
        System.out.println("Java bean has been created!");
    }

    @Override
    public Boolean getTheCourse(Double amount) {
        System.out.println("Java course cost -> "+amount);
        return true;
    }
}
