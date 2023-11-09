package com.project.springtest.repositories;

import com.project.springtest.entities.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class PersonRepoTest {

    @Autowired
    private PersonRepository repository;

    @Test
    void idExists(){
        Person person = new Person(1, "sai", "hyd");
        repository.save(person);

        boolean actual = repository.existsPersonById(1);

        assertThat(actual).isTrue();
    }
}
