package com.spring.vaccineService.service;

import com.spring.vaccineService.model.Vaccine;
import org.springframework.stereotype.Service;

@Service
public interface IVaccineService {
    public String registerVaccine(Vaccine vaccine);
    public Iterable<Vaccine> registerMultipleVaccines(Iterable<Vaccine> vaccines);
    public String removeVaccine(Integer id);
    public Long getVaccineCount();
    public Boolean CheckVaccineAvailability(Integer id);
    public Iterable<Vaccine> getAllVaccinesInfo();
    public Vaccine getVaccineById(Integer id);
}
