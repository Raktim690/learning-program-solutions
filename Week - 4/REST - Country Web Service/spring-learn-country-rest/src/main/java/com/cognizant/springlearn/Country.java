package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {
    private static final Logger LOGGER = LoggerFactory.getLogger(Country.class);

    private String code;
    private String name;

    public Country() {
        LOGGER.debug("Inside Country Constructor.");
    }

    public String getCode() {
        LOGGER.debug("getCode called, returning: {}", code);
        return code;
    }

    public void setCode(String code) {
        this.code = code;
        LOGGER.debug("setCode called with: {}", code);
    }

    public String getName() {
        LOGGER.debug("getName called, returning: {}", name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
        LOGGER.debug("setName called with: {}", name);
    }

    @Override
    public String toString() {
        return "Country{code='" + code + "', name='" + name + "'}";
    }
}
