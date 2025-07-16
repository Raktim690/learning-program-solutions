package com.example.country.controller;

import com.example.country.model.Country;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CountryController {

    @GetMapping("/countries")
    public List<Country> getAllCountries() {
        return Arrays.asList(
            new Country("IN", "India"),
            new Country("US", "United States"),
            new Country("JP", "Japan")
        );
    }
}
