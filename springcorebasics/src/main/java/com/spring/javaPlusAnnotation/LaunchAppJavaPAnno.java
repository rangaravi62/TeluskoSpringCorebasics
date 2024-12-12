package com.spring.javaPlusAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LaunchAppJavaPAnno {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfiguration.class);
        Greetings greetings = context.getBean(Greetings.class);
        System.out.println(greetings.generategreetings("ravi"));
    }
}
