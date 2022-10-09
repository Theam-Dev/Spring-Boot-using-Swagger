package com.example.springbootswagger.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping(method = RequestMethod.POST, value = "/api/testapi")
    public String sayHello(@RequestParam String str) {
        return "Swagger Hello World"+str;
    }
}