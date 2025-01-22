package com.spring.customerRegApp.web;

import com.spring.customerRegApp.model.Customer;
import com.spring.customerRegApp.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class CustomerController {

    @Autowired
    private ICustomerService customerService;

    @GetMapping("/showform")
    public String showCustRegHomePage(Model model){
        model.addAttribute("customer", new Customer()); // Add a blank Customer object to the model
        return "showform";
    }
    @GetMapping("/cxlist")
    public String getCustomerList(Model model){
        model.addAttribute("customers",customerService.getAllCustomers());
        return "customerlist";
    }

    @PostMapping("/registercustomer")
    public String register(@ModelAttribute("customer") Customer customer, Model model){
        customerService.registerCustomer(customer);
        return "redirect:/cxlist";
    }

    @GetMapping("/updateCust")
    public String updateCustomer(@RequestParam("id") Integer id,Model model){
        Customer customer = customerService.getCustById(id);
        model.addAttribute("customer",customer);
        return "showform";
    }

    @GetMapping("/deleteCust")
    public String deleteCustomer(@RequestParam("id") Integer id){
        customerService.deleteCustById(id);
        return "redirect:/cxlist";
    }

}
