/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.Department;
import com.hr.personnel.Employee;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;
import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);

        // add Employees to it
        dept.addEmployee(new SalariedEmployee("Jason", LocalDate.of(1990, 8, 24), 55000));
        dept.addEmployee(new HourlyEmployee("Julie", LocalDate.of(2000, 2, 2), 25, 40));
        dept.addEmployee(new SalariedEmployee("Sagan", LocalDate.of(2022, 9, 29), 100000 ));
        dept.addEmployee(new HourlyEmployee("Rebecca", LocalDate.of(2022,9, 13), 53.13, 40));

        //TODO: create at least one hourly employee and one salaried employee passing them to the addEmployee method


        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        // pay its employees
        System.out.println("\nPay employees:");
        dept.payEmployees();
    }
}