package com.spring.springMvcBasicProj.controller;

import com.spring.springMvcBasicProj.Model.Course;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.Optional;

@Controller
public class CourseController {

    @GetMapping("/courseinfo")
    public String getCourseInfo(Model model){
        Course course = new Course("12345","SpringBoot",5000.00);
        model.addAttribute("course",course);
        return "course";
    }
}
