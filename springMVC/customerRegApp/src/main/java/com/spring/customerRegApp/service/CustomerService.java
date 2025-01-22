package com.spring.customerRegApp.service;

import com.spring.customerRegApp.model.Customer;
import com.spring.customerRegApp.repo.ICustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService{

    @Autowired
    private ICustomerRepo customerRepo;

    @Override
    public List<Customer> getAllCustomers() {
        return (List<Customer>) customerRepo.findAll();
    }

    @Override
    public void registerCustomer(Customer customer) {
         customerRepo.save(customer);
    }

    @Override
    public Customer getCustById(Integer id) {
        return customerRepo.findById(id).get();
    }

    @Override
    public void deleteCustById(Integer id) {
        customerRepo.deleteById(id);
    }


}
