package com.spring.vaccineJpaRepo.Service;

import com.spring.vaccineJpaRepo.customfindermethods.ResultView;
import com.spring.vaccineJpaRepo.customfindermethods.View;
import com.spring.vaccineJpaRepo.model.Vaccine;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

@Service
public interface IVaccineService {
    public Vaccine searchVaccineById(Integer id);
    public List<Vaccine> searchVaccinesByIds(List<Integer> ids);
    public List<Vaccine> searchVaccineByVaccine(Vaccine vaccine);
    public String removeVaccinesByIds(Iterable<Integer> ids);
    public String removeVaccinesByIdsUsingCrud(Iterable<Integer> ids);
    public List<ResultView> fetchByVaccineCostLessThan(Double vaccineCost);
    public List<Vaccine> fetchByVaccineNameInAndVaccineCostBetween(Collection<String> vaccinesNames, Double startRange, Double endRange);
    public <T extends View> List<T> fetchByVaccineCostGreaterThan(Double vaccineCost,Class<T> tClass);





}
