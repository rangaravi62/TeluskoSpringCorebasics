package com.spring.vaccineService.dao;

import com.spring.vaccineService.model.Vaccine;
import org.springframework.data.repository.CrudRepository;

public interface IVaccineRepo extends CrudRepository<Vaccine,Integer> {

}
