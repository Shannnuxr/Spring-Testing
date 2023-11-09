package com.project.springtest.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    long id;

    @Column
    private String name;
    private String occ;

    public Employee() {
    }

    public Employee(long id, String name, String occ) {
        this.id = id;
        this.name = name;
        this.occ = occ;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOcc() {
        return occ;
    }

    public void setOcc(String occ) {
        this.occ = occ;
    }
}
