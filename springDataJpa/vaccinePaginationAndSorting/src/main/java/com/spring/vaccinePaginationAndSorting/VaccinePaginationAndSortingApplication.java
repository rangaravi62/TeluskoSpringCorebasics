package com.spring.vaccinePaginationAndSorting;

import com.spring.vaccinePaginationAndSorting.service.VaccineService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class VaccinePaginationAndSortingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(VaccinePaginationAndSortingApplication.class, args);
		VaccineService vaccineService = applicationContext.getBean(VaccineService.class);
//		vaccineService.fetchVaccinesList(true,"vaccineName","vaccineCompany").forEach(System.out::println);

		vaccineService.fetchVaccieByPagination(2,3,true,"vaccineName","vaccineCompany").forEach(System.out::println);
	}

}
