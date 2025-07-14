package com.example.firstspringboot.services;

import com.example.firstspringboot.models.Employee;
import com.example.firstspringboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HelloWorldService {
    @Autowired
    EmployeeRepository empRepo;

    public List<Employee> getMethod() {
        return empRepo.findAll();
    }

//    public Employee getEmployeeById(int empID) {
//        return empRepo.findById(empID).orElse(new Employee());
//    }
//
//    public Employee getEmployeeByJob(String job) {
//        return (Employee) empRepo.findByJob(job);
//    }

    public String addEmployee(Employee employee) {
        if (employee.getid() != 0 && empRepo.existsById(employee.getid())) {
            throw new RuntimeException("Employee already exists with id: " + employee.getid());
        }
         return empRepo.save(employee).toString();
    }

    public Employee getEmployeeById(int id) {
        return empRepo.findById(id).orElse(null);
    }

    public String deleteEmployee(int id) {
        if (empRepo.existsById(id)) {
            empRepo.deleteById(id);
            return "Employee Deleted Successfully!!";
        }
        return "Employee With Id: "+id+" Not Found!";
    }

    public Employee updateEmployee(int id, Employee updatedEmployee) {
        return empRepo.findById(id).map(employee -> {
            employee.setName(updatedEmployee.getName());
            employee.setRole(updatedEmployee.getRole());
            return empRepo.save(employee);
        }).orElse(null);
    }

    public String getEmployeeId(int id) {
        return null;
    }

    public Employee createEmployee(Employee employee) {
        return null;
    }

    public List<Employee> getAllEmployees() {
        return null;
    }
}