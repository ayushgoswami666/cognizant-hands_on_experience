package com.example.Spring_jpa;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.Spring_jpa.entity.Country;
import com.example.Spring_jpa.service.CountryServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class SpringJpaApplication {
	
	   private static final Logger LOGGER =
	            LoggerFactory.getLogger(SpringJpaApplication.class);

	    private static CountryServices countryService;

	public static void main(String[] args) {
		
		ApplicationContext context =
                SpringApplication.run(SpringJpaApplication.class, args);

        countryService = context.getBean(CountryServices.class);

        LOGGER.info("Inside main");

        testGetAllCountries();
	}
	
	private static void testGetAllCountries() {

        LOGGER.info("Start");

        List<Country> countries =
                countryService.getAllCountries();

        LOGGER.debug("Countries = {}", countries);

        LOGGER.info("End");

    }
	

}
