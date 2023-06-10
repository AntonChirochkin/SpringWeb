package ru.skypro.lessons.springweb.springweb.repository;

import ru.skypro.lessons.springweb.springweb.pojo.Employee;

import java.util.List;

public interface EmployeeRepository {

    public Integer getFindAllSalary();
    public Employee getFindEmployeeWithMinSalary();
    public Employee getFindEmployeeWithMaxSalary();
    public List<Employee> getFindEmployeeSalaryMoreThanAverage();

    public List<Employee> getCreateManyEmployee();

    }
