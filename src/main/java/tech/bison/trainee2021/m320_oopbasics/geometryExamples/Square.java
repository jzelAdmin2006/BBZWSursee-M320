package tech.bison.trainee2021.m320_oopbasics.geometryExamples;

public class Square {

  private double sideLength;

  public Square(double oppositeSide) {
    this.sideLength = oppositeSide;
  }

  public double getSideLength() {
    return sideLength;
  }

  public double getArea() {
    return Math.pow(sideLength, 2);
  }

  public double getDiagonal() {
    return new RightTriangle(sideLength, sideLength).getHypotenuse();
  }
}
