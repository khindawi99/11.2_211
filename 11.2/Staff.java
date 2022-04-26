package ch_11.exercise11_02;

import java.util.Date;

public class Staff extends Employee {

  private String title;

  public Staff(String name, double address, Date phoneNumber, String emailAddress) {
    super(name, address, phoneNumber, emailAddress);
    this.title = title;
  }

  public String getTitle() {
    return title;
  }

  public Staff setTitle(String title) {
    this.title = title;
    return this;
  }

  @Override
  public String toString() {
    return "Staff.class: {" + "Name= " + getName() + '}';
  }
}
