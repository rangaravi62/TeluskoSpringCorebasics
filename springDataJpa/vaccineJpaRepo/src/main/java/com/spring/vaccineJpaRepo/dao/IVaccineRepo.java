package com.spring.vaccineJpaRepo.dao;

import com.spring.vaccineJpaRepo.model.Vaccine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVaccineRepo extends JpaRepository<Vaccine,Integer> {
}
