package com.spring.vaccineJpaRepo.Service;

import com.spring.vaccineJpaRepo.model.Vaccine;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

@Service
public interface IVaccineService {
    public Vaccine searchVaccineById(Integer id);
    public List<Vaccine> searchVaccinesByIds(List<Integer> ids);
    public List<Vaccine> searchVaccineByVaccine(Vaccine vaccine);
    public String removeVaccinesByIds(Iterable<Integer> ids);
    public String removeVaccinesByIdsUsingCrud(Iterable<Integer> ids);


}
