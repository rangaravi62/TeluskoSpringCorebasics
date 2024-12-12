package com.spring.springcorebasics;

import com.spring.springcorebasics.Telusko;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringcorebasicsApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(SpringcorebasicsApplication.class, args);
		Telusko telusko = context.getBean(Telusko.class);
		telusko.buyCourse(99999.99);
	}

}
