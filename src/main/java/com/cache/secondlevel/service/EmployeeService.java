package com.cache.secondlevel.service;

import com.cache.secondlevel.Repository.EmployeeDAO;
import com.cache.secondlevel.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeDAO employeeDAO;

    public Employee doGetEmployee(int id){
      return   employeeDAO.findById(id);
    }

    public Employee doGetEmployee(final String name) {
        return employeeDAO.findByusername(name);
    }
}
