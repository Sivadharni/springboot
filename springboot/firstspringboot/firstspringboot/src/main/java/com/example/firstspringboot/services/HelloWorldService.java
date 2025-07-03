package com.example.firstspringboot.services;

import com.example.firstspringboot.models.Employee;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

@Service
public class HelloWorldService {
    List<Employee> emp = new ArrayList<>(
    Arrays.asList (new Employee(1,"Sivadharni","Intern"), new Employee(2,"Thendral","Developer"))
            );

    public List<Employee> getMethod(){
        return emp;
    }

    public List<Employee> postMethod() {
        return emp;
    }

    public String putMethod() {
        return "This is put method";
    }
    public String deleteMethod() {
        return "This is delete method";
    }

    }

