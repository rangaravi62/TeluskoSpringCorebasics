package com.spring.customQueries.Service;

import com.spring.customQueries.dao.IVaccineRepo;
import com.spring.customQueries.model.Vaccine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VaccineService implements IVaccineService{

    @Autowired
    private IVaccineRepo vaccineRepo;

    @Override
    public List<Vaccine> fetchByVaccineCompany(String vaccineCompany) {
        return vaccineRepo.searchByVaccineCompany(vaccineCompany);
    }

    @Override
    public List<Vaccine> fetchByVaccineName(String vaccineName) {
        return vaccineRepo.searchByVaccineName(vaccineName);
    }

    @Override
    public int updateTheVaccineInfo(Double newPrice, String vaccineName) {
        return vaccineRepo.updateVaccineInfo(newPrice,vaccineName);
    }

    @Override
    public int deleteTheVaccineBetween(Double minRange, Double maxRange) {
        return vaccineRepo.deleteVaccineBetween(minRange,maxRange);
    }
}
