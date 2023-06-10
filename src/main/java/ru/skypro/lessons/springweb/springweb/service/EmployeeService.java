package ru.skypro.lessons.springweb.springweb.service;

import ru.skypro.lessons.springweb.springweb.pojo.Employee;

import java.util.List;

public interface EmployeeService {

//    Employee findEmployeeWithMaxSalary(); //верно

    Integer getFindAllSalary();
    Employee getFindEmployeeWithMinSalary();
    Employee getFindEmployeeWithMaxSalary();
    List<Employee> getFindEmployeeSalaryMoreThanAverage();

    Employee getCreateMany(Employee employee);


}
