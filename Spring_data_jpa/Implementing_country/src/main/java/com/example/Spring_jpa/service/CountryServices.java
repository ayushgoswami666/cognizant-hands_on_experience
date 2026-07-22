package com.example.Spring_jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Spring_jpa.entity.Country;
import com.example.Spring_jpa.repo.CountryRepository;

import jakarta.transaction.Transactional;

@Service
public class CountryServices {

    private final CountryRepository countryRepository;

    CountryServices(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }
 
    @Transactional
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }
    @Transactional
    public Country getCountry(String code) {
        return countryRepository.findById(code).orElse(null);
    }

    

   
    

}