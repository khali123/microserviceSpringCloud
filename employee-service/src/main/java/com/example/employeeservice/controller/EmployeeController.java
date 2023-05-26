package com.example.employeeservice.controller;

import com.example.employeeservice.EmployeeServiceApplication;
import com.example.employeeservice.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/employee")

public class EmployeeController {

    @GetMapping
    public List<Employee> getEmployee(){

        List<Employee> listEmployees = Arrays.asList(
                        new Employee(11),
                new Employee(14)

        );
        return listEmployees;
    }

}
