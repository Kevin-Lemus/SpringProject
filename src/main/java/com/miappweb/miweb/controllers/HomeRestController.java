package com.miappweb.miweb.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HomeRestController {

    @GetMapping("/home")
    public Map<String, Object> home(){
        Map<String, Object> body = new HashMap<>();

        body.put("title", "Mi Primera Web");
        body.put("nombre", "Kevin Cruz");
        body.put("profesion", "Desarrollador");

        return body;
    }

    @GetMapping("/details")
    public Map<String, Object> details(){
        Map<String, Object> body = new HashMap<>();

        body.put("apellido", "Cruz");
        body.put("nombre", "Kevin");
        body.put("profesion", "Desarrollador");
        body.put("edad", "26");
        body.put("departamento", "SS");

        return body;
    }
}
