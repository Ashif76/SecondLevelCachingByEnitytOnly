package com.cache.secondlevel.Repository;

import com.cache.secondlevel.entities.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDAO extends CrudRepository<Employee,Integer> {
    Employee findById(int id);
    Employee findByusername(String name);
}
