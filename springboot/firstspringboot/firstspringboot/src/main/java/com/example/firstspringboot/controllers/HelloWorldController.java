package com.example.firstspringboot.controllers;

import com.example.firstspringboot.models.Employee;
import com.example.firstspringboot.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class HelloWorldController {

    @Autowired
     private HelloWorldService hws;
    @GetMapping("/")
    public List<Employee> hello(){

        return hws.getMethod();
    }
    @PostMapping("/")
    public List<Employee> postMethod(){
        return hws.postMethod();
    }

    @PutMapping("/")
    public String putMethod(){
        return hws.putMethod();
    }

    @DeleteMapping ("/")
    public String DeleteMethod(){
        return hws.deleteMethod();
    }
}