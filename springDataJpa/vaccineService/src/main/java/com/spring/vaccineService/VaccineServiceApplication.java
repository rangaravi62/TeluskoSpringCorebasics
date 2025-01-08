package com.spring.vaccineService;

import com.spring.vaccineService.dao.IVaccineRepo;
import com.spring.vaccineService.model.Vaccine;
import com.spring.vaccineService.service.VaccineService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class VaccineServiceApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = SpringApplication.run(VaccineServiceApplication.class, args);
		VaccineService vaccineService = applicationContext.getBean(VaccineService.class);
//		Vaccine v1 = new Vaccine("Covin","Gastro",5000.55);
//		System.out.println(vaccineService.registerVaccine(v1));


		Vaccine v2 = new Vaccine("CoviShield","Covin",9075.363);
//		Vaccine v3 = new Vaccine("Rabi65","Pharma",45000.00);
//		Vaccine v4 = new Vaccine("CancerVac","InterNat",200000.00);
//        vaccineService.registerMultipleVaccines(new ArrayList<>(List.of(v2,v3,v4))).forEach(System.out::println);

		System.out.println(vaccineService.removeVaccine(2));

//		System.out.println("No of vaccines in db -> "+vaccineService.getvaccineCount());


	}

}
