package tech.bison.trainee2021.m320_oopbasics.salaryPeopleInterfaceExample_cdd;

import java.lang.reflect.Field;

public abstract class Person {
  private String lastName;

  public Person(String lastName, String firstName) {
    setLastName(lastName);
    setFirstName(firstName);
  }

  private String firstName;

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Field[] outputData() {
    return Person.class.getDeclaredFields();
  }
}
