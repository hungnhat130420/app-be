package com.proj1.controller;

import com.proj1.model.Employee;
import com.proj1.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import javax.validation.ValidationException;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Employee>> getListEmployee() {
        return new ResponseEntity<>(employeeService.findAllEmployee(), HttpStatus.OK);
    }

    @RequestMapping(value= "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Employee> createEmployee(@Valid @RequestBody Employee employee) {

        return new ResponseEntity<>(employeeService.createEmployee(employee), HttpStatus.CREATED);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Employee> findById(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(employeeService.findEmployeeById(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Boolean> deleteById(@PathVariable("id") Integer id) {
        if (employeeService.findEmployeeById(id) != null){
            return new ResponseEntity<>(employeeService.deleteEmployeeById(id), HttpStatus.OK);
        }
        return new ResponseEntity<>(Boolean.FALSE, HttpStatus.BAD_REQUEST);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Employee> updateById(@PathVariable("id") Integer id, @RequestBody Employee employee) {

        return new ResponseEntity<>( employeeService.updateEmployeeById(employee, id), HttpStatus.OK);
    }
}
