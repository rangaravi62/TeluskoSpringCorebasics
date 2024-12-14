package com.spring.vaccineJpaRepo;

import com.spring.vaccineJpaRepo.Service.IVaccineService;
import com.spring.vaccineJpaRepo.Service.VaccineService;
import com.spring.vaccineJpaRepo.model.Vaccine;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class VaccineJpaRepoApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(VaccineJpaRepoApplication.class, args);
		IVaccineService vaccineService = context.getBean(VaccineService.class);
//		System.out.println(vaccineService.searchVaccineById(3));

//		System.out.println(vaccineService.searchVaccinesByIds(List.of(1,2,3)));

//		vaccineService.searchVaccineByVaccine(new Vaccine("Elara","Barnard Star b",50005.0)).forEach(System.out::println);


//		System.out.println(vaccineService.removeVaccinesByIds(List.of(5,4)));

//		System.out.println(vaccineService.removeVaccinesByIdsUsingCrud(List.of(6,7)));


	}



}
