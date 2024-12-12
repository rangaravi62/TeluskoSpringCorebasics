package com.spring.xml;


import com.spring.beans.Employee;
import com.spring.beans.Telusko;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class LaunchAppLazyInitialization {
    public static void main(String[] args) {

        // Beanfactory doesn't create beans on loading, it only created when we use getBean method
        DefaultListableBeanFactory container = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader read = new XmlBeanDefinitionReader(container);
        read.loadBeanDefinitions("applicationContextConfig.xml");
        read.loadBeanDefinitions("applicationContextConfig2.xml"); // we can load N number of config xmls with a single container which we cannot do with ApplicationContext

        Employee employee1 = container.getBean("emp1",Employee.class);
        System.out.println(employee1);
        Telusko telusko = container.getBean(Telusko.class);
    }
}
