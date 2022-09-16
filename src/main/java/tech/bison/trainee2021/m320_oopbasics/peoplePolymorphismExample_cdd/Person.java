package tech.bison.trainee2021.m320_oopbasics.peoplePolymorphismExample_cdd;

public class Person {
  private static String message = "Guten Tag";
  private final int id;
  private String firstName;
  private String lastName;

  public Person(int id, String firstName, String lastName) {
    this.id = id;
    this.setFirstName(firstName);
    this.setLastName(lastName);
  }

  public int getId() {
    return id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getMessage() {
    return firstName + " " + lastName + " sagt: " + message;
  }
}
