package com.example.firstspringboot.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {
    @Id
    private int empID;
    private String name;
    private String job;

    public int getid() {
        return 0;
    }

    public Object getRole() {
        return null;
    }

    public Object getName() {
        return null;
    }

    public void setName(Object name) {

    }

    public void setRole(Object role) {
    }
}