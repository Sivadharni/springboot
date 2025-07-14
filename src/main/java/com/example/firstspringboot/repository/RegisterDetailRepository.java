package com.example.firstspringboot.repository;

import com.example.firstspringboot.models.RegisterDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RegisterDetailRepository extends JpaRepository<RegisterDetails,Integer> {

    RegisterDetails findByEmail(String email);
}