package com.example.firstspringboot.controllers;


import com.example.firstspringboot.models.Employee;
import com.example.firstspringboot.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class HelloWorldController {

    @Autowired
    private HelloWorldService hws;

    @GetMapping
    public List<Employee> getMethod(){
        return hws.getMethod();
    }

    @GetMapping("/{empID}")
    public Employee getEmployeeById(@PathVariable int empID){
        return hws.getEmployeeById(empID);
    }

    @GetMapping("/{job}")
    public Employee getEmployeeByJob(@PathVariable String job){
        return hws.getEmployeeByJob(job);
    }

    @PostMapping
    public String postMethod(@RequestBody Employee employee){
//        Employee employee = new Employee(5,"Sivagami", "Business");
        return hws.addEmployee(employee);
    }
    @PutMapping
    public String putMethod(@RequestBody Employee employee){
        return hws.updateEmployee(employee);
    }
    @DeleteMapping("/{empID}")
    public String deleteMethod(@PathVariable int empID){
        return hws.deleteEmployeeById(empID);
    }
}