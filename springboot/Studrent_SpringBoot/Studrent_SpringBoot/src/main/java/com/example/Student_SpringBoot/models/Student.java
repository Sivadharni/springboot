package com.example.Student_SpringBoot.models;


import lombok.Data;

@Data
public class Student {
    private String name;
    private int stdid;
    private String department;


    public Student(String name, int stdid, String department) {
        this.name = name;
        this.stdid = stdid;
        this.department = department;
    }

}
