package com.spring.springPlusJdbc;

import com.spring.springPlusJdbc.dao.AlienDaoImpl;
import com.spring.springPlusJdbc.dao.IAlienDao;
import com.spring.springPlusJdbc.model.Alien;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringPlusJdbcApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(SpringPlusJdbcApplication.class, args);
		IAlienDao alienDao = context.getBean(AlienDaoImpl.class);
		List<Alien> aliens = alienDao.getAlienInfo();
		aliens.forEach(System.out::println);
	}

}
