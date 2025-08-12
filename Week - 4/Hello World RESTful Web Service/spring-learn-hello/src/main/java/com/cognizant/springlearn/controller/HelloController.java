package com.cognizant.springlearn.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

   
    @GetMapping(value = "/hello", produces = MediaType.TEXT_PLAIN_VALUE)
    public String sayHello() {
        LOGGER.info("sayHello START");          
        String response = "Hello World!!";      
        LOGGER.info("sayHello END");            
        return response;
    }
}

