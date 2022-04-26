package ch_11.exercise11_02;

import java.util.Date;

public class Employee extends Person {

  private String office;
  private double salary;
  private Date dateHired;

  public Employee(String name, String address, String phoneNumber, String emailAddress) {
    super(name, address, phoneNumber, emailAddress);
    this.office = office;
    this.salary = salary;
    dateHired = new Date();
  }

  public Employee(String name, double v, Date date, String emailAddress) {
  }

  public String getOffice() {
    return office;
  }

  public double getSalary() {
    return salary;
  }

  public Date getDateHired() {
    return dateHired;
  }

  @Override
  public String toString() {
    return "class: Employee\nname: " + getName();
  }
}

