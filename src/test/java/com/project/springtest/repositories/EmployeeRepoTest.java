package com.project.springtest.repositories;

import com.project.springtest.entities.Employee;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EmployeeRepoTest {
    @Autowired
    private EmployeeRepository repository;

    @Test
    @Order(1)
    public void saveEmployee(){
        Employee emp = new Employee(1, "sai", "engineer");

        repository.save(emp);

        assertThat(emp.getId()).isGreaterThan(0);
    }

    @Test
    @Order(2)
    public void getEmployee(){
        Employee emp = repository.findById(1L).get();

        assertThat(emp.getId()).isEqualTo(1L);
    }

    @Test
    @Order(3)
    public void getAllEmployees(){
        List<Employee> list = repository.findAll();

        assertThat(list.size()).isGreaterThan(0);
    }

    @Test
    @Order(4)
    public void upDateEmployee(){
        Employee emp = repository.findById(1L).get();
        emp.setName("Saik");
        Employee updated = repository.save(emp);

        assertThat(updated.getName()).isEqualTo("Saik");
    }

    @Test
    @Order(5)
    public void deleteEmployee(){
        Employee emp = repository.findById(1L).get();
        repository.delete(emp);

        Employee nullEmployee = null;
        Optional<Employee> employee = repository.findByName("Saik");

        if(employee.isPresent()) nullEmployee = employee.get();

        assertThat(nullEmployee).isNull();
     }
}
