package com.example.firstspringboot.controllers;

import com.example.firstspringboot.models.RegisterDetails;
import com.example.firstspringboot.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    AuthService authService;

    //Register
    @GetMapping("/register")
    public List<RegisterDetails> getDetails(){
        return authService.getDetails();
    }

    @PostMapping("/register")
    public String addNewuser(@RequestBody RegisterDetails register){

        return authService.addNewEmployee(register);
    }

    //Login
    @GetMapping("/login")
    public String Login(){
        return "Emplouee Login Successfully";
    }

    @PostMapping("/login")
    public String login(@RequestBody RegisterDetails login){

        return authService.authPostLoginService(login);
    }

}