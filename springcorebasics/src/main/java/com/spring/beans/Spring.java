package com.spring.beans;

public class Spring implements ICourse {

    public Spring(){
        System.out.println("Spring bean has been created!");
    }

    @Override
    public Boolean getTheCourse(Double amount) {
        System.out.println("Spring course cost -> "+amount);
        return true;
    }
}
