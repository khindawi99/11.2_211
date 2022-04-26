package ch_11.exercise11_02;

public class Person {

  private String name;
  private String address;
  private String phoneNumber;
  private String emailAddress;

  public Person(String name, String address, String phoneNumber, String emailAddress) {
    this.name = name;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.emailAddress = emailAddress;
  }

  public Person() {
  }

  public String getName() {
    return name;
  }


  public String getAddress() {
    return address;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }


  public String getEmailAddress() {
    return emailAddress;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  @Override
  public String toString() {
    return "class: Person\nname: " + getName();
  }
}
