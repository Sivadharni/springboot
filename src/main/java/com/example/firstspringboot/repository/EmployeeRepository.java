package com.example.firstspringboot.repository;

import com.example.firstspringboot.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    List<Employee> findByJob(String job);
}
