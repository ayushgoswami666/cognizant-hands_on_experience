package com.cognizant.Spring_learn.service;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import com.cognizant.Spring_learn.entity.Country;

@Service
public class CountrySevice {

    public Country getCountry(String code) {

        List<Country> countryList = getCountries();

        return countryList.stream()
                .filter(country -> country.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElse(null);
    }

    private List<Country> getCountries() {

        List<Country> countryList = new ArrayList<>();

        try {
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream("country.xml");

            DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document = builder.parse(inputStream);

            NodeList countries = document.getElementsByTagName("country");

            for (int i = 0; i < countries.getLength(); i++) {

                String countryCode = document.getElementsByTagName("code").item(i).getTextContent();
                String countryName = document.getElementsByTagName("name").item(i).getTextContent();

                countryList.add(new Country(countryCode, countryName));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return countryList;
    }
}
