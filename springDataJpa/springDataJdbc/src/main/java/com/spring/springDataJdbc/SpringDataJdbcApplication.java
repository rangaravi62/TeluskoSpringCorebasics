package com.spring.springDataJdbc;

import com.spring.springDataJdbc.dao.AlienDaoImpl;
import com.spring.springDataJdbc.model.Alien;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDataJdbcApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(SpringDataJdbcApplication.class, args);
		AlienDaoImpl alienDao = context.getBean(AlienDaoImpl.class);
		Alien alien = new Alien(4,"ravi","banglore");
		if (alienDao.insert(alien)) System.out.println("Inserted a row");;

	}

}
