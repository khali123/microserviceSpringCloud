package com.tutobiq.departmentservice.model;

import java.util.ArrayList;
import java.util.List;

public class Departement {
    private Long id;
    private String nom;
    private List<Employee> employees=new ArrayList<>();

    public Departement() {
    }

    public Departement(Long id, String nom, List<Employee> employees) {
        this.id = id;
        this.nom = nom;
        this.employees = employees;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
