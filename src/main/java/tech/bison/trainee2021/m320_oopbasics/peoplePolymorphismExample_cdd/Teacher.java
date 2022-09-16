package tech.bison.trainee2021.m320_oopbasics.peoplePolymorphismExample_cdd;

public class Teacher extends Person {

  private static String message = "Es beliebt mich zu erquicken.";
  private double dailySalary;

  public Teacher(int id, String firstName, String lastName, double dailySalary) {
    super(id, firstName, lastName);
    this.setDailySalary(dailySalary);
  }

  public double getDailySalary() {
    return dailySalary;
  }

  public void setDailySalary(double dailySalary) {
    this.dailySalary = dailySalary;
  }

  @Override
  public String getMessage() {
    return this.getFirstName() + " " + this.getLastName() + " sagt: " + message;
  }
}
