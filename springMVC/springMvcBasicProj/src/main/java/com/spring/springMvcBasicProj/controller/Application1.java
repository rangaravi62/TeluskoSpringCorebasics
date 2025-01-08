package com.spring.springMvcBasicProj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
//@RequestMapping("/demo")
public class Application1 {

    @RequestMapping(value = "/telusko",method = RequestMethod.GET)
    public ModelAndView displayWelcomeMessage(){
        ModelAndView modelAndView =  new ModelAndView();
        modelAndView.addObject("Welcome", "This is my first Application!");
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @GetMapping("/telusko1")  // introduced from spring 5
    public String displayWithModel(Model model){
        System.out.println("displayWithModel model implementing class -> "+model.getClass().getName());

        //displayWithModel model implementing class -> org.springframework.validation.support.BindingAwareModelMap

        model.addAttribute("display","Suprise! Suprise! Mother Fucker!!!");
        return "success";  // returning the view name
    }

    @GetMapping("/success")  // return type is void, here the endpoint is the view name , for this to work the class level mapping shouldn't be there, we need to hit endpoint directly, this is not recommended!
    public void displayWithNoReturn(Map<String,Object> map){
        map.put("display","Suprise! Suprise! Mother Fucker!!!");
    }

}
