package tech.bison.trainee2021.m320_oopbasics.geometryExamples;

public class Square {

  private double sideLength;

  public Square(int sideLength) {
    this.sideLength = sideLength;
  }

  public double getSideLength() {
    return sideLength;
  }

  public double getArea() {
    return Math.pow(sideLength, 2);
  }
}
