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
    double height = new RightTriangle(this.height, sideLength / 2).getHypotenuse();
    return new IsoscelesTriangle(sideLength, height);
  }

  public double getSideEdge() {
    return getSideTriangle().getThigh();
  }

  public double getVolume() {
    return getBase().getArea() * height / 3;
  }

  public double getLateralArea() {
    return getSideTriangle().getArea() * 4;
  }

  public double getSurfaceArea() {
    return getLateralArea() + getBase().getArea();
  }

  public double getTotalEdgeLength() {
    return getBase().getScope() + getSideEdge() * 4;
  }

  public double getLateralSlope() {
    RightTriangle lateralSlopeTriangle = new RightTriangle(sideLength / 2, height);
    return lateralSlopeTriangle.getAlpha();
  }
}
