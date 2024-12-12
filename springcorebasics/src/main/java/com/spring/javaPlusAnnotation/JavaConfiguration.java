package com.spring.javaPlusAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.time.LocalTime;

// this java config is not recommended because if any change happens in java code again we need to rebuild, redeploy the application

@Configuration
@ComponentScan(basePackages = {"com.spring.javaPlusAnnotation"})
public class JavaConfiguration {

        public JavaConfiguration(){
                System.out.println("java config bean created");
        }

        @Bean
        public LocalTime createTimeObj(){
            return LocalTime.now();
        }

}
