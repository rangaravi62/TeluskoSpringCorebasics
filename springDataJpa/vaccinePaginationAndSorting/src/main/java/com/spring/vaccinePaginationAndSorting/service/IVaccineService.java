package com.spring.vaccinePaginationAndSorting.service;

import com.spring.vaccinePaginationAndSorting.model.Vaccine;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IVaccineService {
    public Iterable<Vaccine> fetchVaccinesList(boolean isAsc,String... properties);
    public List<Vaccine> fetchVaccieByPagination(int pageNo, int pageSize,boolean isAsc,String... properties);
    public void fetchVaccineByPages(int pageSize);

}
