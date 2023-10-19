package com.loveable.mybatis.service;

import com.loveable.mybatis.models.Employee;
import com.loveable.mybatis.mappers.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Transactional
    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id);
    }

    @Transactional
    public void createEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Transactional
    public void updateEmployee(Employee employee) {
        employeeRepository.update(employee);
    }

    @Transactional
    public void deleteEmployee(Long id) {
        employeeRepository.delete(id);
    }
}
