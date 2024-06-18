package com.mindera.mindswap;

import com.mindera.mindswap.employee.Employee;

import java.time.Year;
import java.util.*;
import java.util.stream.Collectors;


public class EmployeeAnalyzer {

    // Count the number of employees that having been working at that department for more than n years
    public long countEmployees(List<Employee> employees, int years) {
        return employees.stream().filter(e -> Year.now().getValue() - e.getStartingYear() > years).count();
    }

    // Find the name of the employees that have a salary over n
    public List<String> findEmployeeBySalary(List<Employee> employees, int salary) {
        return employees.stream().filter(e -> e.getSalary() > salary).map(Employee::getFirstName).toList();
    }

    // Get the oldest n employees
    public List<Employee> findOldestEmployees(List<Employee> employees, int numberOfEmployees) {
        return employees.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed()).limit(numberOfEmployees).toList();
    }

    // Find the first employee older than n
    public Optional<Employee> findFirstEmployeeByAge(List<Employee> employees, int age) {
        return employees.stream().findFirst().filter(e -> e.getAge() > age);
    }

    // Find the average salary in a department
    public Double findAverageSalary(List<Employee> employees) {
        return employees.stream().mapToDouble(Employee::getSalary).average().orElse(0.0);
    }

    // Finding common first names between the employees of two departments
    public List<String> findCommonNames(List<Employee> firstDepartment, List<Employee> secondDepartment) {
        Set<String> namesFirstDepartment = firstDepartment.stream().map(Employee::getFirstName).collect(Collectors.toSet());
        return secondDepartment.stream().map(Employee::getFirstName).filter(namesFirstDepartment::contains).distinct().toList();
    }
}
