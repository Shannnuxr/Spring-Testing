package com.project.springtest.controllers;

import com.project.springtest.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private PersonService service;

    @GetMapping("/persons")
    public ResponseEntity<?> getAllPeople(){
        return ResponseEntity.ok(service.getAllPeople());
    }
}
