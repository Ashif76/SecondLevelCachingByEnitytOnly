package com.cache.secondlevel.controller;

import com.cache.secondlevel.service.EmployeeService;
import com.cache.secondlevel.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping("/api/employee")
    public void addEmployee(){

    }

    @PutMapping("/api/modify/employee")
    public String updateEmployee(@RequestBody Employee emp){
        employeeService.doUpdateEmployee(emp);
        return "Records updated successfully";
    }

}
