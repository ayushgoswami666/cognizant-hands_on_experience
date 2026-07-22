package com.example.Spring_jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Spring_jpa.entity.*;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

}