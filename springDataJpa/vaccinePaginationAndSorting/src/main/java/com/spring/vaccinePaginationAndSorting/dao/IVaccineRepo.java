package com.spring.vaccinePaginationAndSorting.dao;

import com.spring.vaccinePaginationAndSorting.model.Vaccine;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IVaccineRepo extends PagingAndSortingRepository<Vaccine,Integer> {
}
