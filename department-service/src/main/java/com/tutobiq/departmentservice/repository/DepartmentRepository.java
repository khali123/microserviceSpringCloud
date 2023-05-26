package com.tutobiq.departmentservice.repository;

import com.tutobiq.departmentservice.model.Departement;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DepartmentRepository {
    public List<Departement> departements =new ArrayList<>();

    public Departement addDepartement(Departement d){
        this.departements.add(d);
        return d;
    }

    public Departement findByIdDepartement(Long idDepartemnt){
        return departements.stream()
                .filter(departement -> departement.getId().equals(idDepartemnt))
                .findFirst()
                .orElseThrow();
    }

    public List<Departement> findAll(){
        return departements;
    }

    // °



}
