package com.spring.springcorebasics;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
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
