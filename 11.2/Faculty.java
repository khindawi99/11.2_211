package ch_11.exercise11_02;

public class Faculty extends Employee {

  private String officeHours;
  private String rank;

  public Faculty(String name, String address, String phoneNumber, String emailAddress) {
    super(name, address, phoneNumber, emailAddress);
    this.officeHours = officeHours;
    this.rank = rank;
  }



  public String getOfficeHours() {
    return officeHours;
  }

  public String getRank() {
    return rank;
  }

  @Override
  public String toString() {
    return "class: Faculty\nname: " + getName();
  }
}
