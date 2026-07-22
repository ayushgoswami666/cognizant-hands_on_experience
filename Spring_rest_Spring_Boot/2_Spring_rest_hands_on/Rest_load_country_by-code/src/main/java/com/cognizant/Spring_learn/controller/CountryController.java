package com.cognizant.Spring_learn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.Spring_learn.entity.Country;
import com.cognizant.Spring_learn.service.CountrySevice;


@RestController
public class CountryController {
	 private final CountrySevice countryService;

	CountryController(CountrySevice countryService) {
		this.countryService = countryService;
	}

	    @GetMapping("/countries/{code}")
	    public Country getCountry(@PathVariable String code) {
	        return countryService.getCountry(code);
	    }

}
