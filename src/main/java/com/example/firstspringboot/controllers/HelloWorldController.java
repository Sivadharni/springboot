package com.example.firstspringboot.controllers;

import com.example.firstspringboot.models.Employee;
import com.example.firstspringboot.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/employee")
@RestController
public class HelloWorldController {

    @Autowired
     private HelloWorldService hws;

    @GetMapping
    public List<Employee> getMethod(){

        return hws.getMethod();
    }

    @GetMapping("/empID")
    public Employee getEmployeeID(@PathVariable int empID){

        return hws.getEmployeeById(empID);
    }

    @PostMapping
    public String postMethod(@RequestBody Employee employees){
       // Employee e1 = new Employee(5,"siva","inten");
        return hws.postMethod(employees);
    }

    @PutMapping
    public String putMethod(@RequestBody Employee employee){
        return hws.updateRecord(employee.getEmpID());
    }

    @DeleteMapping("/{empID}")
    public String DeleteMethod(@PathVariable int empID){
        return hws.deleteEmployeeByID(empID);
    }
}