package tech.bison.trainee2021.m320_oopbasics.geometryExamples;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class RightTriangleTest {
  @Test
  void newRightTriangleWithAdjacentOne_getAdjacent_isOne() {
    RightTriangle rightTriangle = new RightTriangle(1, 1);

    double adjacent = rightTriangle.getAdjacent();

    assertThat(adjacent).isOne();
  }

  @Test
  void newRightTriangleWithAdjacentTwo_getAdjacent_isTwo() {
    RightTriangle rightTriangle = new RightTriangle(2, 1);

    double adjacent = rightTriangle.getAdjacent();

    assertThat(adjacent).isEqualTo(2);
  }

  @Test
  void newRightTriangleWithOppositeSideOne_getOppositeSide_isOne() {
    RightTriangle rightTriangle = new RightTriangle(1, 1);

    double adjacent = rightTriangle.getOppositeSide();

    assertThat(adjacent).isOne();
  }

  @Test
  void newRightTriangleWithOppositeSideTwo_getOppositeSide_isTwo() {
    RightTriangle rightTriangle = new RightTriangle(2, 2);

    double adjacent = rightTriangle.getOppositeSide();

    assertThat(adjacent).isEqualTo(2);
  }

  @Test
  void newRightTriangleWithAdjacentOppositeSideOne_getHypotenuse_isSquareRootOfTwo() {
    RightTriangle rightTriangle = new RightTriangle(1, 1);

    double hypotenuse = rightTriangle.getHypotenuse();

    assertThat(hypotenuse).isEqualTo(Math.sqrt(2));
  }

  @Test
  void newRightTriangleWithAdjacentThreeOppositeSideFour_getHypotenuse_isFive() {
    RightTriangle rightTriangle = new RightTriangle(3, 4);

    double hypotenuse = rightTriangle.getHypotenuse();

    assertThat(hypotenuse).isEqualTo(5);
  }
}
