package com.example.Student_SpringBoot.controllers;

import com.example.Student_SpringBoot.models.Student;
import com.example.Student_SpringBoot.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HelloWorldController {
    @Autowired
    private HelloWorldService hws;
    @GetMapping("/")
    public List<Student> hello(){

        return hws.getMethod();
    }
    @PostMapping("/")
    public List<Student> postMethod(){
        return hws.postMethod();
    }

    @PutMapping("/")
    public String putMethod(){
        return hws.putMethod();
    }

    @DeleteMapping("/")
    public String DeleteMethod(){
        return hws.deleteMethod();
    }
}

