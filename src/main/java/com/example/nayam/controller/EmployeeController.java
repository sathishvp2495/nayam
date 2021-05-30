package com.example.nayam.controller;

import com.example.nayam.entiry.Employee;
import com.example.nayam.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/save")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.saveEmp(employee);
    }


    @GetMapping("/listEmployee")
    public List<Employee> listAllEmployee(){
        return employeeService.getAllEmployee();
    }


}
