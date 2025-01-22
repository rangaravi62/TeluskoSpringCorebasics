package com.spring.customerRegApp.repo;

import com.spring.customerRegApp.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface ICustomerRepo extends CrudRepository<Customer, Integer> {

}
