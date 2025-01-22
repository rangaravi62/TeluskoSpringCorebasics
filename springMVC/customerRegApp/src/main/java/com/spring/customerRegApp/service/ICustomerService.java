package com.spring.customerRegApp.service;

import com.spring.customerRegApp.model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ICustomerService {
    public List<Customer> getAllCustomers();
    public void registerCustomer(Customer customer);
    public Customer getCustById(Integer id);
    public void deleteCustById(Integer id);
}
