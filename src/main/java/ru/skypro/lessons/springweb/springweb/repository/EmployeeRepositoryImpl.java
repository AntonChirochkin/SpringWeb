package ru.skypro.lessons.springweb.springweb.repository;

import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.stereotype.Repository;
import ru.skypro.lessons.springweb.springweb.exeption.EmployeeNotFoundExeption;
import ru.skypro.lessons.springweb.springweb.pojo.Employee;
import ru.skypro.lessons.springweb.springweb.service.EmployeeService;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;
import static java.util.Arrays.stream;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

    // Коллекция для имитации данных
    private final List<Employee> employeeList = List.of(
            new Employee("Катя", 90_000),
            new Employee("Дима", 102_000),
            new Employee("Олег", 80_000),
            new Employee("Вика", 165_000),
            new Employee("Женя", 175_000));



    public Integer getFindAllSalary() {
        return employeeList.stream()
                .map(x -> x.getSalary())
                .collect(Collectors.summingInt(Integer::intValue));
    }

    @Override
    public Employee getFindEmployeeWithMinSalary(){
        return employeeList.stream()
                .min(Comparator.comparingInt(Employee::getSalary))
                .orElseThrow(EmployeeNotFoundExeption::new);

    }
    @Override
    public Employee getFindEmployeeWithMaxSalary(){
        return employeeList.stream()
                .max(Comparator.comparingInt(Employee::getSalary))
                .orElseThrow(EmployeeNotFoundExeption::new);
    }

    @Override
    public List<Employee> getFindEmployeeSalaryMoreThanAverage(){
        Integer sum = employeeList.stream()
                .map(x -> x.getSalary())
                .collect(Collectors.summingInt(Integer::intValue));
        Integer avg = sum / employeeList.toArray().length;
        return employeeList.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary))
                .filter(employee -> employee.getSalary() > avg)
                .collect(Collectors.toList());

    }

    @Override
    public Employee getCreateMany(List<Employee> employees) {
        return employees.forEach(Employee -> employeeList.add(employee));
    }

}