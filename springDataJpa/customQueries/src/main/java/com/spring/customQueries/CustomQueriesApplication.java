package com.spring.customQueries;

import com.spring.customQueries.Service.IVaccineService;
import com.spring.customQueries.Service.VaccineService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CustomQueriesApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = SpringApplication.run(CustomQueriesApplication.class, args);
		IVaccineService vaccineService = applicationContext.getBean(VaccineService.class);
//		vaccineService.fetchByVaccineName("Covin").forEach(System.out::println);
//		vaccineService.fetchByVaccineCompany("Kepler-452b").forEach(System.out::println);

//		int update = vaccineService.updateTheVaccineInfo(20000.00,"Covin");
//		if (update != 0) System.out.println("Updated Successfully!");
//		else System.out.println("Failed to Update!");

		int delete = vaccineService.deleteTheVaccineBetween(46000.00,50000.0);
		if (delete != 0) System.out.println("Deleted Successfully!");
		else System.out.println("Failed to Delete!");


	}


}
