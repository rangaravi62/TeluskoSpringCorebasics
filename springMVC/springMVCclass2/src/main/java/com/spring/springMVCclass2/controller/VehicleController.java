package com.spring.springMVCclass2.controller;


import com.spring.springMVCclass2.model.Vehicle;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class VehicleController {
    @GetMapping("/register")
    public String showVehicleRegisterHomePage(){
        return "register";
    }

    @PostMapping("/register")
    public String showVehicleResponse(Model model, @ModelAttribute Vehicle vehicle){
//      Adding ModelAttribute is not mandatory in latest versions of spring boot
        model.addAttribute("vehicle",vehicle);
        return "response";
    }


    // The two way binding can be achieved spring tag library, for this adding ModelAttribute is mandatory
}
