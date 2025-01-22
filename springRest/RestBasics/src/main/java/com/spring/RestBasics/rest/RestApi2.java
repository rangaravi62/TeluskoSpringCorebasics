package com.spring.RestBasics.rest;


import com.spring.RestBasics.model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController     // @RestController -> @Controller + @ResponseBody , follows rest principles
@RequestMapping("/api2")
public class RestApi2 {

    @GetMapping("/getStudent")
    public ResponseEntity<Student> getStudent(){
        Student student = new Student(1,"Ravi","Teja","Hindupur");
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    // output is {"id":1,"firstName":"Ravi","secondName":"Teja","city":"Hindupur"}, spring internally uses jackson api to convert
//       Java object into json string.OK

    @PostMapping("/addStudent")
    public ResponseEntity<Student> addStudent(@RequestBody Student student){
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }

}
