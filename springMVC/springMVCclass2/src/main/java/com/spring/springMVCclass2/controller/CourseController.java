package com.spring.springMVCclass2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CourseController {

    // string, void and ModelAndView can be returned for jsp and html ui in the controllers
    @GetMapping("/home")
    public String showHomePage() {
        return "home";
    }

    @GetMapping("/response")
    public String showResponse(Model model) {
        model.addAttribute("course", new String[] {"Java", "Spring Boot", "Devops"});
        return "course";
    }

    @GetMapping("/getInfo")
    public String showSomeMessageQueryParam(@RequestParam("name") String n,String course, Model model){
//        Query param example
//        http://localhost:8485/courseApp/getInfo?name=likith&course=spring
//        RequestParam ->  maps the query param and local params
//        query params should be in the end of the url, starts with ?, form of key value pair
//      If the var name in the url and in the method are matching writing RequestParam is not mandatory, if not mathcing then it is mandatory!
        model.addAttribute("info","Hello "+n+"! Enjoy the "+course+" course!");
        return "home";
    }



    @GetMapping("/getInfo/{name}/{course}")
    public String showSomeMessagePathParam(@PathVariable("name") String name, @PathVariable("course") String c, Model model){
//        Path param example
//        http://localhost:8485/courseApp/getInfo/likith/devops
        model.addAttribute("info","Hello "+ name +"! Enjoy the "+c+" course!");
        return "home";
    }



}