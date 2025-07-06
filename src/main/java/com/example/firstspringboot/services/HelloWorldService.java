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
public Employee getEmployeeById(int empID){
        int ind = 0;
        boolean flag = false;
        for(int i =0;i < emp.size();i++){
            if(empID == emp.get(i).getEmpID()){
                System.out.println("Emp_ID: " + emp.get(i).getEmpID()+ emp.get(i));
                ind = i;
                flag = true;
                break;
            }
        }
        if(flag){
            return emp.get(ind);
        }
        else{
            return new Employee();
        }
}

    public String postMethod(Employee employees) {
        emp.add(employees);
        return "Employee Added Successfully";

    }



    public String deleteEmployeeByID(int empID) {
        int ind = 0;
        boolean flag = false;
        for(int i =0;i < emp.size();i++){
            if(empID == emp.get(i).getEmpID()){
                System.out.println("Emp_ID: " + emp.get(i).getEmpID()+ emp.get(i));
                ind = i;
                flag = true;
                break;
            }
        }
        if(flag){
            emp.remove(ind);
            return "Deleted Employee Successfully";
        }
        else{
            return "No such Employee Present";
        }
    }

    public String updateRecord(int empID) {
        int ind = 0;
        boolean flag = false;
        for(int i =0;i < emp.size();i++){
            if(empID == emp.get(i).getEmpID()){
                System.out.println("Emp_ID: " + emp.get(i).getEmpID()+ emp.get(i));
                ind = i;
                flag = true;
                break;
            }
        }
        if(flag){
            Employee employee = null;
            emp.set(ind,employee);
            return "updated Employee Successfully";
        }
        else{
            return "No such Employee Present";
        }
    }
}
