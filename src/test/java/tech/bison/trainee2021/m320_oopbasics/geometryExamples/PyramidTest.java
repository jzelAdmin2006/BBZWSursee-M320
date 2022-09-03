package tech.bison.trainee2021.m320_oopbasics.geometryExamples;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class PyramidTest {
  @Test
  void newPyramidWithSideLengthOne_getSideLength_isOne() {
    Pyramid pyramid = new Pyramid(1, 1);

    double sideLength = pyramid.getSideLength();

    assertThat(sideLength).isOne();
  }

  @Test
  void newPyramidWithSideLengthTwo_getSideLength_isTwo() {
    Pyramid pyramid = new Pyramid(2, 1);

    double sideLength = pyramid.getSideLength();

    assertThat(sideLength).isEqualTo(2);
  }

  @Test
  void newPyramidWithHeightOne_getHeight_isOne() {
    Pyramid pyramid = new Pyramid(1, 1);

    double height = pyramid.getHeight();

    assertThat(height).isOne();
  }

  @Test
  void newPyramidWithHeightOne_getHeight_isTwo() {
    Pyramid pyramid = new Pyramid(1, 2);

    double height = pyramid.getHeight();

    assertThat(height).isEqualTo(2);
  }
}
