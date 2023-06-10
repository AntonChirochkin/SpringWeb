package ru.skypro.lessons.springweb.springweb.service;

import ru.skypro.lessons.springweb.springweb.pojo.Employee;
import ru.skypro.lessons.springweb.springweb.repository.EmployeeRepository;

import java.util.List;

public interface EmployeeService {

//    Employee findEmployeeWithMaxSalary(); //верно
,
    Integer getFindAllSalary();
    Employee getFindEmployeeWithMinSalary();
    Employee getFindEmployeeWithMaxSalary();
    List<Employee> getFindEmployeeSalaryMoreThanAverage();
    void createManyEmployee(List<Employee> employeeList);

}
