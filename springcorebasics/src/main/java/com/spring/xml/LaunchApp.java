package com.spring.xml;

import com.spring.beans.Telusko;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaunchApp {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("applicationContextConfig.xml");
        System.out.println("------------------");
        Telusko telusko = container.getBean(Telusko.class);
        telusko.buyCourse(5555.55);
    }
}
