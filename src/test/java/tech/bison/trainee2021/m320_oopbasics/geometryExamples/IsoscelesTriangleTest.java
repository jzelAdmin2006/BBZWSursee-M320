package tech.bison.trainee2021.m320_oopbasics.geometryExamples;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class IsoscelesTriangleTest {
  @Test
  void newIsoscelesTriangleWithBaseOne_getBase_isOne() {
    IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle(1, 1);

    double base = isoscelesTriangle.getBase();

    assertThat(base).isOne();
  }

  @Test
  void newIsoscelesTriangleWithBaseTwo_getBase_isTwo() {
    IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle(2, 1);

    double base = isoscelesTriangle.getBase();

    assertThat(base).isEqualTo(2);
  }

  @Test
  void newIsoscelesTriangleWithHeightOne_getBase_isOne() {
    IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle(1, 1);

    double height = isoscelesTriangle.getHeight();

    assertThat(height).isOne();
  }

  @Test
  void newIsoscelesTriangleWithHeightTwo_getHeight_isTwo() {
    IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle(1, 2);

    double height = isoscelesTriangle.getHeight();

    assertThat(height).isEqualTo(2);
  }

  @Test
  void newIsoscelesTriangleWithBaseHeightOne_getArea_isOneHalf() {
    IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle(1, 1);

    double area = isoscelesTriangle.getArea();

    assertThat(area).isEqualTo(0.5);
  }

  @Test
  void newRightTriangleWithAdjacentOppositeSideTwo_getArea_isTwo() {
    IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle(2, 2);

    double area = isoscelesTriangle.getArea();

    assertThat(area).isEqualTo(2);
  }
}
