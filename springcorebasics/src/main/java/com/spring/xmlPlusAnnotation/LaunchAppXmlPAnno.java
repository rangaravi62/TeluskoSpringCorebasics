package com.spring.xmlPlusAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaunchAppXmlPAnno {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("applicationContextConfigXmlPAnno.xml");
        Telusko telusko = container.getBean(Telusko.class);
        telusko.buyCourse(100000.99);
    }
}
