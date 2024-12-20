package com.spring.customQueries.Service;

import com.spring.customQueries.model.Vaccine;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IVaccineService {
    public List<Vaccine> fetchByVaccineCompany(String vaccineCompany);
    public List<Vaccine> fetchByVaccineName(String vaccineName);
    public int updateTheVaccineInfo(Double newPrice, String vaccineName);
    public int deleteTheVaccineBetween(Double minRange, Double maxRange);


}
