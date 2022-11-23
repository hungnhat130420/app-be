package com.proj1.service.impl;

import com.proj1.exception.EmployeeNotFoundException;
import com.proj1.model.Employee;
import com.proj1.repository.EmployeeRepository;
import com.proj1.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> findAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findEmployeeById(Integer id) {
        return employeeRepository.findById(id)
                .orElseThrow(()-> new EmployeeNotFoundException(id));
    }

    @Override
    public Employee updateEmployeeById(Employee employeeUpdate, Integer id) {

        employeeUpdate =  employeeRepository.findById(id).orElseThrow(()-> new EmployeeNotFoundException(id));
        Employee employee = new Employee();
        employee.setName(employeeUpdate.getName());
        employee.setEmail(employeeUpdate.getEmail());
        return employeeRepository.save(employee);

    }

    @Override
    public boolean deleteEmployeeById(Integer id) {
        employeeRepository.deleteById(id);
        return true;
    }
}
