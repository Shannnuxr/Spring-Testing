package com.project.springtest.services;

import com.project.springtest.entities.Person;
import com.project.springtest.repositories.PersonRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class PersonServiceTest {
    @Mock
    private PersonRepository repository;

    private PersonService service;

    @BeforeEach
    void setUp() {
        this.service = new PersonService(repository);
    }

    @Test
    void getAllPeople() {
        service.getAllPeople();
        verify(repository).findAll();
    }
}