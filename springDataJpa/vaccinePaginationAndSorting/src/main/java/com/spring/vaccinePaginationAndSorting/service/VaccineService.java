package com.spring.vaccinePaginationAndSorting.service;

import com.spring.vaccinePaginationAndSorting.dao.IVaccineRepo;
import com.spring.vaccinePaginationAndSorting.model.Vaccine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VaccineService implements IVaccineService{

    @Autowired
    private IVaccineRepo vaccineRepo;


    @Override
    public Iterable<Vaccine> fetchVaccinesList(boolean isAsc, String... properties) {
        Sort sort = Sort.by(isAsc ? Sort.Direction.ASC : Sort.Direction.DESC,properties );
        return vaccineRepo.findAll(sort);
    }

    @Override
    public List<Vaccine> fetchVaccieByPagination(int pageNo, int pageSize, boolean isAsc, String... properties) {
        Sort sort = Sort.by(isAsc ? Sort.Direction.ASC : Sort.Direction.DESC,properties );
        Pageable pageable = PageRequest.of(pageNo,pageSize,sort);
        return vaccineRepo.findAll(pageable).get().collect(Collectors.toList());
    }

    @Override
    public void fetchVaccineByPages(int pageSize) {
        vaccineRepo.c
    }
}
