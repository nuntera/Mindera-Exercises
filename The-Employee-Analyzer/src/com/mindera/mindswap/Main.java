package com.mindera.mindswap;

import com.mindera.mindswap.db.DB;

public class Main {
    public static void main(String[] args) {

        /*
               ----------------Requirements------------------
        Create a class capable of analysing a list of department employees.

        This class should be able to:
        Count the number of employees that having been working at that department for more than n years
        Find the name of the employees that have a salary over n
        Get the oldest n employees
        Find the first employee older than n
        Find the average salary in a department
        Finding common first names between the employees of two departments

         */

        EmployeeAnalyzer employeeAnalyzer = new EmployeeAnalyzer();

        System.out.println("-".repeat(100));
        System.out.println("EmployeeAnalyzer.countEmployees() = " + employeeAnalyzer.countEmployees(DB.getDevelopmentDepartment(), 7));
        System.out.println("-".repeat(100));
        System.out.println("EmployeeAnalyzer.findEmployeeBySalary() = " + employeeAnalyzer.findEmployeeBySalary(DB.getHrDepartment(), 1200));
        System.out.println("-".repeat(100));
        System.out.println("EmployeeAnalyzer.findOldestEmployees() = " + employeeAnalyzer.findOldestEmployees(DB.getMarketingDepartment(), 3));
        System.out.println("-".repeat(100));
        System.out.println("EmployeeAnalyzer.findFirstEmployeeByAge() = " + employeeAnalyzer.findFirstEmployeeByAge(DB.getDevelopmentDepartment(), 40));
        System.out.println("-".repeat(100));
        System.out.println("EmployeeAnalyzer.findAverageSalary() = " + employeeAnalyzer.findAverageSalary(DB.getSalesDepartment()));
        System.out.println("-".repeat(100));
        System.out.println("EmployeeAnalyzer.findCommonNames() = " + employeeAnalyzer.findCommonNames(DB.getDevelopmentDepartment(), DB.getMarketingDepartment()));
    }
}
