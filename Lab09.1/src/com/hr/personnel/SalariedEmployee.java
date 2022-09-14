package com.hr.personnel;

import gov.irs.TaxPayer;
import java.time.LocalDate;

public class SalariedEmployee extends Employee {

  private double salary;

  public SalariedEmployee() {
  }

  public SalariedEmployee(String name, LocalDate hireDate) {
    super(name, hireDate);
  }

  public SalariedEmployee(String name, LocalDate hireDate, double salary) {
    this(name, hireDate);
    setSalary(salary);
  }


  public void pay() {
    //System.out.println(getName() + " is paid salary " + getSalary());
    System.out.printf("%s is paid a salary of %,.2f%n", getName(), getSalary());
  }

  @Override
  public void payTaxes() {
    double taxes = salary * SALARIED_TAX_RATE;
    System.out.println(getName() + " paid taxes of " + taxes);
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    return super.toString() +
        ", salary=" + salary;
  }
}
