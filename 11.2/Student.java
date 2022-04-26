package ch_11.exercise11_02;

public class Student extends Person {

  public final String STATUS;
  public static final String Freshman = "freshman";
  public static final String Sophomore = "sophomore";
  public static final String Junior = "junior";
  public static final String Senior = "senior";

  public Student(String STATUS) {
    this.STATUS = STATUS;
  }

  public Student(String name, String address, String phoneNumber, String emailAddress,
      String STATUS) {
    super(name, address, phoneNumber, emailAddress);
    this.STATUS = STATUS;
  }

  @Override
  public String toString() {
    return "Student.class: {" + "Name= " + this.getName() + '}';
  }
}
