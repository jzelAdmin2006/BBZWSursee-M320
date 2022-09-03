package tech.bison.trainee2021.m320_oopbasics.geometryExamples;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class SquareTest {

  @Test
  void newSquareWithSideLengthOne_getSideLength_isOne() {
    Square square = new Square(1);

    double sideLength = square.getSideLength();

    assertThat(sideLength).isOne();
  }

  @Test
  void newSquareWithSideLengthTwo_getSideLength_isTwo() {
    Square square = new Square(2);

    double sideLength = square.getSideLength();

    assertThat(sideLength).isEqualTo(2);
  }

  @Test
  void squareWithSideLengthOne_getArea_isOne() {
    Square square = new Square(1);

    double area = square.getArea();

    assertThat(area).isOne();
  }

  @Test
  void squareWithSideLengthTwo_getArea_isFour() {
    Square square = new Square(2);

    double area = square.getArea();

    assertThat(area).isEqualTo(4);
  }
}
