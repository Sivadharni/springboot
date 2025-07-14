package com.example.firstspringboot.services;

import com.example.firstspringboot.models.RegisterDetails;
import com.example.firstspringboot.repository.RegisterDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthService {

    @Autowired
    private RegisterDetailRepository registerDetailRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public String addNewEmployee(RegisterDetails register) {
        register.setPassword(passwordEncoder.encode(register.getPassword()));
        registerDetailRepository.save(register);
        return "Employee added Successfully";
    }

    public List<RegisterDetails> getDetails() {
        return registerDetailRepository.findAll();
    }

    public String authPostLoginService(RegisterDetails login) {
        RegisterDetails user = registerDetailRepository.findByEmail(login.getEmail());
        if (user != null && passwordEncoder.matches(login.getPassword(), user.getPassword())) {
            return "Login Successfully";
        }
        return "Invalid Credentials";
    }
}
