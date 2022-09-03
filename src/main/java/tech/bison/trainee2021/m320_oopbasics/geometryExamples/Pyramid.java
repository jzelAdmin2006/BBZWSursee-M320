package tech.bison.trainee2021.m320_oopbasics.geometryExamples;

public class Pyramid {

  private double sideLength;
  private double height;

  public Pyramid(double sideLength, double height) {
    this.sideLength = sideLength;
    this.height = height;
  }

  public double getSideLength() {
    return sideLength;
  }

  public double getHeight() {
    return height;
  }

  public Square getBase() {
    return new Square(sideLength);
  }

  public IsoscelesTriangle getSideTriangle() {
    double height = new RightTriangle(sideLength, sideLength / 2).getHypotenuse();
    return new IsoscelesTriangle(sideLength, height);
  }

  public double getSideEdge() {
    double baseDiagonal = getBase().getDiagonal();
    RightTriangle sideEdgeHypotenuseTriangle = new RightTriangle(baseDiagonal / 2, height);
    return sideEdgeHypotenuseTriangle.getHypotenuse();
  }

  public double getVolume() {
    return getBase().getArea() * height / 3;
  }

  public double getSurfaceArea() {
    return getSideTriangle().getArea() * 4 + getBase().getArea();
  }
}
