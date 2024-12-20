package com.spring.vaccineJpaRepo.customfindermethods;

import org.springframework.stereotype.Service;

// static projection -> we will be able to get only vaccineName and vaccineCompany

@Service
public interface ResultView {
    public String getVaccineName();
    public String getVaccineCompany();
}
