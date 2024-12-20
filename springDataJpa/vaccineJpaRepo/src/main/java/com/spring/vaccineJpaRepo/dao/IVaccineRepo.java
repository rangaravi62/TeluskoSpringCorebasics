package com.spring.vaccineJpaRepo.dao;

import com.spring.vaccineJpaRepo.customfindermethods.ResultView;
import com.spring.vaccineJpaRepo.customfindermethods.View;
import com.spring.vaccineJpaRepo.model.Vaccine;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;

public interface IVaccineRepo extends JpaRepository<Vaccine,Integer> {

    //findByPropertyKeywordPropertyKeyword......................


    List<ResultView> findByVaccineCostLessThan(Double vaccineCost); // custom finder methods -> findBy - fieldname - keyword

    //using multiple properties and keywords, the arguments must be in order as per the properties and keywords
    List<Vaccine> findByVaccineNameInAndVaccineCostBetween(Collection<String> vaccinesNames,Double startRange, Double endRange);

    public <T extends View>List<T> findByVaccineCostGreaterThan(Double vaccineCost, Class<T> tClass);
}
