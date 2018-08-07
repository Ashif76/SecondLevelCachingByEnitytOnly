package com.cache.secondlevel.controller;

import com.cache.secondlevel.service.EmployeeService;
import com.cache.secondlevel.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeRest {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/api/employee/{id}")
    public Employee getEmployee(@PathVariable Integer id){
      return   employeeService.doGetEmployee(id);
    }

    @GetMapping("/api/employeebyname/{name}")
    public Employee getEmployeebyName(@PathVariable String name){
        return   employeeService.doGetEmployee(name);
    }
}
