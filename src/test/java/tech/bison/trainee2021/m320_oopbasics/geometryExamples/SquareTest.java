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

  @Test
  void squareWithSideLengthOne_getDiagonal_isSquareRootOfTwo() {
    Square square = new Square(1);

    double diagonal = square.getDiagonal();

    assertThat(diagonal).isEqualTo(Math.sqrt(2));
  }

  @Test
  void squareWithSideLengthTwo_getDiagonal_isSquareRootOfEight() {
    Square square = new Square(2);

    double diagonal = square.getDiagonal();

    assertThat(diagonal).isEqualTo(Math.sqrt(8));
  }

  @Test
  void squareWithSideLengthOne_getScope_isFour() {
    Square square = new Square(1);

    double scope = square.getScope();

    assertThat(scope).isEqualTo(4);
  }

  @Test
  void squareWithSideLengthTwo_getScope_isEight() {
    Square square = new Square(2);

    double scope = square.getScope();

    assertThat(scope).isEqualTo(8);
  }
}
