package org.demo;

import org.demo.dto.Contractor;
import org.demo.dto.Employee;
import org.demo.dto.FullTimeEmployee;

public class Main {
    public static final String Contractor = "Contractor";
    public static final String FullTimeEmployee = "fullTimeEmployee";

    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        Employee contractor = new Contractor(Contractor,10,10);
        Employee fullTimeEmployee = new FullTimeEmployee(FullTimeEmployee,8);
        System.out.println(contractor.calculateSalary());
        System.out.println(fullTimeEmployee.calculateSalary());
    }
}