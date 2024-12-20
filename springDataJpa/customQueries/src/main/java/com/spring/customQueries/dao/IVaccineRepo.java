package com.spring.customQueries.dao;

import com.spring.customQueries.model.Vaccine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface IVaccineRepo  extends JpaRepository<Vaccine,Integer> {

    @Query("FROM Vaccine WHERE vaccineCompany = :vaccineCompany")
    public List<Vaccine> searchByVaccineCompany(String vaccineCompany);

    @Query("FROM Vaccine WHERE vaccineName= :vc")
    public List<Vaccine> searchByVaccineName(@Param("vc") String vaccineName);


    @Transactional
    @Modifying
    @Query("UPDATE Vaccine SET vaccineCost = :newPrice WHERE vaccineName = :vaccineName")
    public int updateVaccineInfo(Double newPrice, String vaccineName);

    @Transactional
    @Modifying
    @Query("DELETE Vaccine WHERE vaccineCost BETWEEN :minRange AND :maxRange")
    public int deleteVaccineBetween(Double minRange, Double maxRange);


}
