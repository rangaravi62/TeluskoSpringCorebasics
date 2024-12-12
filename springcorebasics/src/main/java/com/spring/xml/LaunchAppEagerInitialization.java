package com.spring.xml;

import com.spring.beans.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaunchAppEagerInitialization {
    public static void main(String[] args) {
        //All the beans defined in the config gets created regardless of getBean method
        ApplicationContext container = new ClassPathXmlApplicationContext("applicationContextConfig2.xml");
//      Employee employee = container.getBean(Employee.class); // throws NoUniqueBeanDefinitionException as there are 2 beans defined in config2.xml
        Employee employee1 = container.getBean("emp1",Employee.class);
        System.out.println(employee1);
        Employee employee2 = container.getBean("emp2",Employee.class);
        System.out.println(employee2);

    }
}
