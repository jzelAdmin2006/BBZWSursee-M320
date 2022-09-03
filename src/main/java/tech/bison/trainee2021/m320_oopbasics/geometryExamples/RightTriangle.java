package tech.bison.trainee2021.m320_oopbasics.geometryExamples;

public class RightTriangle {

  private double adjacent;
  private double oppositeSide;

  public RightTriangle(double adjacent, double oppositeSide) {
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

  public double getArea() {
    return adjacent * oppositeSide / 2;
  }
}
