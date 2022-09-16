package tech.bison.trainee2021.m320_oopbasics.peoplePolymorphismExample_cdd;

public class Teenager extends Person {

  private static String pubertyMessage = "Hau ab, mann";
  private static String notPubertyMessage = "Boaa eyy voll krasss mann, eyy und so!";
  private boolean isInPuberty;

  public Teenager(int id, String firstName, String lastName, boolean isInPuberty) {
    super(id, firstName, lastName);
    this.setInPuberty(isInPuberty);
  }

  public boolean isInPuberty() {
    return isInPuberty;
  }

  public void setInPuberty(boolean isInPuberty) {
    this.isInPuberty = isInPuberty;
  }

  @Override
  public String getMessage() {
    if (isInPuberty) {
      return this.getFirstName() + " " + this.getLastName() + " sagt: " + pubertyMessage;
    } else {
      return this.getFirstName() + " " + this.getLastName() + " sagt: " + notPubertyMessage;
    }
  }
}
