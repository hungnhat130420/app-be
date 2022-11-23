package com.proj1.service;

import com.proj1.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    List<Employee> findAllEmployee();

    Employee createEmployee( Employee employee );

    Employee findEmployeeById(Integer id);

    Employee updateEmployeeById(Employee employeeUpdate, Integer id);

    boolean deleteEmployeeById(Integer id);

}
