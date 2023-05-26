package com.tutobiq.departmentservice.controller;

import com.tutobiq.departmentservice.model.Departement;
import com.tutobiq.departmentservice.repository.DepartmentRepository;
import org.bouncycastle.pqc.crypto.newhope.NHSecretKeyProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/department")
public class DepartementController {

    @Autowired
    public DepartmentRepository departmentRepository;

    public static final Logger LOGGER= LoggerFactory.getLogger(DepartementController.class);

    @PostMapping
    public Departement add(@RequestBody Departement departement){
           return departmentRepository.addDepartement(departement);
    }

    @GetMapping
    public List<Departement> findAll(){
        return departmentRepository.findAll();
    }

    @GetMapping("/{id}")
    public Departement findById(@PathVariable("id") Long id){
        return departmentRepository.findByIdDepartement(id);
    }


}
