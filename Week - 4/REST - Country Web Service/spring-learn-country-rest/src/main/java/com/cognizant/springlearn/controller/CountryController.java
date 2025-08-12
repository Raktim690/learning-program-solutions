package com.cognizant.springlearn.controller;

import com.cognizant.springlearn.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {
    private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);

    @GetMapping(value = "/country", produces = MediaType.APPLICATION_JSON_VALUE)
    public Country getCountryIndia() {
        LOGGER.info("getCountryIndia START");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("country.xml");
        Country country = ctx.getBean("country", Country.class);

        LOGGER.info("getCountryIndia END - returning: {}", country);
        ((ClassPathXmlApplicationContext) ctx).close();
        return country;
    }
}
