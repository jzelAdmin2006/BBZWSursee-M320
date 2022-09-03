package tech.bison.trainee2021.m320_oopbasics.geometryExamples;

public class IsoscelesTriangle {

  private double base;
  private double height;

  public IsoscelesTriangle(double base, double height) {
    this.base = base;
    this.height = height;
  }

  public double getBase() {
    return base;
  }

  public double getHeight() {
    return height;
  }

  public double getArea() {
    return base * height / 2;
  }

  public double getThigh() {
    return new RightTriangle(base / 2, height).getHypotenuse();
  }
}
