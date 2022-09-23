package tech.bison.trainee2021.m320_oopbasics.salaryPeopleInterfaceExample_cdd;

public class Employee extends Person {

  private double salary;
  private String company;

  public Employee(String lastName, String firstName, double salary, String company) {
    super(lastName, firstName);
    setCompany(company);
    setSalary(salary);
  }

  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }
}
