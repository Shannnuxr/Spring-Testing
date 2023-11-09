package com.project.springtest.services;

import com.project.springtest.entities.Person;
import com.project.springtest.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    private PersonRepository repository;

    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }

    public List<Person> getAllPeople(){
        return repository.findAll();
    }
}
