package com.example.Student_SpringBoot.services;

import com.example.Student_SpringBoot.models.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class HelloWorldService {
    List<Student> std = new ArrayList<>(
            Arrays.asList (new Student("Sivadharni",1,"IT"), new Student("Thendral",2,"CSE"))
    );

    public List<Student> getMethod(){

        return std;
    }

    public List<Student> postMethod() {
        return std;
    }

    public String putMethod() {
        return "This is put method";
    }
    public String deleteMethod() {
        return "This is delete method";
    }
}
