package com.dyd.curso.springboot.app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloControler {

    @GetMapping("/app/foo")
    public Map<String, Object> foo() {

        Map<String, Object> json = new HashMap<>();
        json.put("message", "Hola mundo Spring Boot API Rest");
        json.put("date", new Date());

        return json;
    }
}
