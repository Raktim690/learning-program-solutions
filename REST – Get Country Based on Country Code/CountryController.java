package com.example.country.controller;

import com.example.country.model.Country;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/country")
public class CountryController {

    private static final Map<String, Country> countryMap = new HashMap<>();

    static {
        countryMap.put("IN", new Country("IN", "India"));
        countryMap.put("US", new Country("US", "United States"));
        countryMap.put("JP", new Country("JP", "Japan"));
    }

    @GetMapping("/{code}")
    public Country getCountryByCode(@PathVariable String code) {
        return countryMap.getOrDefault(code.toUpperCase(), new Country("N/A", "Not Found"));
    }
}
