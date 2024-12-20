package com.spring.vaccineJpaRepo.Service;

import com.spring.vaccineJpaRepo.customfindermethods.ResultView;
import com.spring.vaccineJpaRepo.customfindermethods.View;
import com.spring.vaccineJpaRepo.dao.IVaccineRepo;
import com.spring.vaccineJpaRepo.model.Vaccine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

@Service
public class VaccineService implements IVaccineService{

    @Autowired
    private IVaccineRepo vaccineRepo;

    @Override
    public Vaccine searchVaccineById(Integer id) {
//        return vaccineRepo.findById(id).orElse(new Vaccine());
        return vaccineRepo.getReferenceById(id);
    }

    @Override
    public List<Vaccine> searchVaccinesByIds(List<Integer> ids) {
        return vaccineRepo.findAllById(ids);
    }

    @Override
    public List<Vaccine> searchVaccineByVaccine(Vaccine vaccine) {
        Example example = Example.of(vaccine);
        return vaccineRepo.findAll(example);
    }


//    delete v1_0 from vaccine v1_0 where v1_0.vaccine_id in (?,?) -> deletes with a single query
    @Override
    public String removeVaccinesByIds(Iterable<Integer> ids) {
        List<Vaccine> foundVaccines = vaccineRepo.findAllById(ids);
        if(foundVaccines.size() == ((List<Integer>)ids).size()){
            vaccineRepo.deleteAllByIdInBatch(ids);
            return "Records deleted for the given ids successfully!";
        }else return "Failed to delete records!";
    }


    // uses a separate delete query for each id
    @Override
    public String removeVaccinesByIdsUsingCrud(Iterable<Integer> ids) {
        List<Vaccine> foundVaccines = vaccineRepo.findAllById(ids);
        if(foundVaccines.size() == ((List<Integer>)ids).size()){
            vaccineRepo.deleteAllById(ids);
            return "Records deleted for the given ids successfully!";
        }else return "Failed to delete records@";
    }

    @Override
    public List<ResultView> fetchByVaccineCostLessThan(Double vaccineCost) {
        return vaccineRepo.findByVaccineCostLessThan(vaccineCost);
    }

    @Override
    public List<Vaccine> fetchByVaccineNameInAndVaccineCostBetween(Collection<String> vaccinesNames, Double startRange, Double endRange) {
        return vaccineRepo.findByVaccineNameInAndVaccineCostBetween(vaccinesNames,startRange,endRange);
    }

    @Override
    public <T extends View> List<T> fetchByVaccineCostGreaterThan(Double vaccineCost,Class<T> tClass) {
        return vaccineRepo.findByVaccineCostGreaterThan(vaccineCost,tClass);
    }

}
