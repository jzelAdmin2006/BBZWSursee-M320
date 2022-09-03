package tech.bison.trainee2021.m320_oopbasics.geometryExamples;

public class RightTriangle {

  private double adjacent;
  private double oppositeSide;

  public RightTriangle(int adjacent, int oppositeSide) {
    this.adjacent = adjacent;
    this.oppositeSide = oppositeSide;
  }

  public double getAdjacent() {
    return adjacent;
  }

  public double getOppositeSide() {
    return oppositeSide;
  }

  public double getHypotenuse() {
    return Math.sqrt(new Square(adjacent).getArea() + new Square(oppositeSide).getArea());
  }
}
