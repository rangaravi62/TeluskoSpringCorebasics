package com.spring.vaccinePaginationAndSorting.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vaccine {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer vaccineId;

    private String vaccineName;
    private String vaccineCompany;
    private Double vaccineCost;


    public Vaccine(){
    }

    public Vaccine(String vaccineName, String vaccineCompany, Double vaccineCost) {
        this.vaccineName = vaccineName;
        this.vaccineCompany = vaccineCompany;
        this.vaccineCost = vaccineCost;
    }

    public Integer getVaccineId() {
        return vaccineId;
    }

    public void setVaccineId(Integer vaccineId) {
        this.vaccineId = vaccineId;
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public String getVaccineCompany() {
        return vaccineCompany;
    }

    public void setVaccineCompany(String vaccineCompany) {
        this.vaccineCompany = vaccineCompany;
    }

    public Double getVaccineCost() {
        return vaccineCost;
    }

    public void setVaccineCost(Double vaccineCost) {
        this.vaccineCost = vaccineCost;
    }

    @Override
    public String toString() {
        return "Vaccine{" +
                "vaccineId=" + vaccineId +
                ", vaccineName='" + vaccineName + '\'' +
                ", vaccineCompany='" + vaccineCompany + '\'' +
                ", vaccineCost=" + vaccineCost +
                '}';
    }
}
