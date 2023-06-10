package ru.skypro.lessons.springweb.springweb.service;

import org.springframework.stereotype.Service;
import ru.skypro.lessons.springweb.springweb.pojo.Employee;
import ru.skypro.lessons.springweb.springweb.repository.EmployeeRepository;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }



    public Integer getFindAllSalary(){
        return employeeRepository.getFindAllSalary();
    }
    public Employee getFindEmployeeWithMinSalary(){ return employeeRepository.getFindEmployeeWithMinSalary(); }
    public Employee getFindEmployeeWithMaxSalary(){ return employeeRepository.getFindEmployeeWithMaxSalary(); }
    public List<Employee> getFindEmployeeSalaryMoreThanAverage(){ return employeeRepository.getFindEmployeeSalaryMoreThanAverage(); }
    public Employee getCreateMany(){ return employeeRepository.getCreateMany(); }
}