package com.spring.springDataJpa1;

import com.spring.springDataJpa1.dao.IAlienRepo;
import com.spring.springDataJpa1.model.Alien;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringDataJpa1Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(SpringDataJpa1Application.class, args);
		Alien alien = new Alien(8,"MSD","Ranchi");
		IAlienRepo iAlienRepo = context.getBean(IAlienRepo.class);
		Alien a= iAlienRepo.save(alien);
		System.out.println(a);
		List<String> list = new ArrayList<>();
		list.set()

	}

}
