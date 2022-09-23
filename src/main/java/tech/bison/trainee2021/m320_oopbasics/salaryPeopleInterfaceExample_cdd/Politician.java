package tech.bison.trainee2021.m320_oopbasics.salaryPeopleInterfaceExample_cdd;

public class Politician extends PartyMember implements WorthWhilePerson {

  private double salary;
  private String council;

  public Politician(String lastName, String firstName, String party, String council) {
    super(lastName, firstName, party);
    setCouncil(council);
    setSalary(salary);
  }

  public String getCouncil() {
    return council;
  }

  public void setCouncil(String council) {
    this.council = council;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }
}
