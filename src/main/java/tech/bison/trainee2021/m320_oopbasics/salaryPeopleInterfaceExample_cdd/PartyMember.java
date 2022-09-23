package tech.bison.trainee2021.m320_oopbasics.salaryPeopleInterfaceExample_cdd;

public abstract class PartyMember extends Person {

  private String party;

  public PartyMember(String lastName, String firstName, String party) {
    super(lastName, firstName);
    setParty(party);
  }

  public String getParty() {
    return party;
  }

  public void setParty(String party) {
    this.party = party;
  }
}
