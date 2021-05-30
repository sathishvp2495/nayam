package com.example.nayam.service;

import com.example.nayam.entiry.Employee;
import com.example.nayam.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee saveEmp(Employee employee){
        return employeeRepository.save(employee);
    }


    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }


}
