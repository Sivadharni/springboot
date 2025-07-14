package com.example.firstspringboot.controllers;


import com.example.firstspringboot.models.Employee;
import com.example.firstspringboot.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private HelloWorldService hws;

    @PreAuthorize("hasAnyRole('ADMIN','USER')")
    @GetMapping("/getEmployee")
    public List<Employee> getAllEmployees(){

        return hws.getAllEmployees();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/createEmployee")
    public Employee createEmployee(@RequestBody Employee employee){

        return hws.createEmployee(employee);
    }

    @PreAuthorize("hasAnyRole('ADMIN','USER')")
    @GetMapping("/getEmployeeById{id}")
    public String getEmployeeById(@PathVariable int id){
        return hws.getEmployeeId(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable int id){
        return hws.deleteEmployee(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/updateEmployee/{id}")
    public Employee updateEmployee(@PathVariable int id, @RequestBody Employee employee) {
        Employee updated = hws.updateEmployee(id, employee);
        if (updated != null) {
            return updated;
        } else {
            throw new RuntimeException("Employee not found with id: " + id);
        }
    }
}