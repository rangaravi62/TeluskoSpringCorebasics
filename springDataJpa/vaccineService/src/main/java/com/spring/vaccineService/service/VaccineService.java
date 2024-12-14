package com.spring.vaccineService.service;

import com.spring.vaccineService.dao.IVaccineRepo;
import com.spring.vaccineService.model.Vaccine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VaccineService implements IVaccineService {

    @Autowired
    private IVaccineRepo vaccineRepo;

    @Override
    public String registerVaccine(Vaccine vaccine) {
        Vaccine savedVaccine = vaccineRepo.save(vaccine);
        return "Registered Vaccine "+savedVaccine.getVaccineName()+" with Id : "+savedVaccine.getVaccineId();

    }

    @Override
    public Iterable<Vaccine> registerMultipleVaccines(Iterable<Vaccine> vaccines) {
        return vaccineRepo.saveAll(vaccines);
    }

    @Override
    public String removeVaccine(Integer id) {
        if (vaccineRepo.findById(id).isPresent()) {
            vaccineRepo.deleteById(id);
            return "Deleted Vaccine " + id;
        }else return "Vaccine with "+id +"is not available to delete";
    }

    @Override
    public Long getVaccineCount() {
        return vaccineRepo.count();
    }

    @Override
    public Boolean CheckVaccineAvailability(Integer id) {
        return vaccineRepo.existsById(id);
    }

    @Override
    public Iterable<Vaccine> getAllVaccinesInfo() {
        return vaccineRepo.findAll();
    }

    @Override
    public Vaccine getVaccineById(Integer id) {
        Optional<Vaccine> vaccineOptional = vaccineRepo.findById(id);
        return vaccineOptional.orElseGet(Vaccine::new);
    }


}
