package com.webapp.hellowwebapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController

public class HelloController {

    Logger logger = Logger.getLogger(HelloController.class.getName());
    @GetMapping(path="/hello")
    public String hello(){
        logger.log(Level.WARNING,"Inside Hello1 to check git integration");
        return ("hello webapp from GIT after change");
    }
}
