package com.spring.RestBasics.rest;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api1")
public class RestApi1 {

    @GetMapping("/greet")
    @ResponseBody         // whenever we use this and the response is not for jsp or html files it'll not go to model and view , the response directly goes
    public ResponseEntity<String> getWishes(){
        return new ResponseEntity<>("HI RANGA! WELCOME!!!",HttpStatus.OK);
    }


    @GetMapping("/greet2")
    @ResponseBody         // whenever we use this and the response is not for jsp or html files it'll not go to model and view , the response directly goes
    public String getWishes2(){
        return "HI RANGA! WELCOME!!!";
    }
}
