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
  void newPyramidWithHeightTwo_getHeight_isTwo() {
    Pyramid pyramid = new Pyramid(1, 2);

    double height = pyramid.getHeight();

    assertThat(height).isEqualTo(2);
  }

  @Test
  void pyramidWithSideLengthOne_getBaseSquare_sideLengthIsOne() {
    Pyramid pyramid = new Pyramid(1, 1);

    Square base = pyramid.getBase();

    assertThat(base.getSideLength()).isEqualTo(1);
  }

  @Test
  void pyramidWithSideLengthTwo_getBaseSquare_sideLengthIsTwo() {
    Pyramid pyramid = new Pyramid(2, 1);

    Square base = pyramid.getBase();

    assertThat(base.getSideLength()).isEqualTo(2);
  }

  @Test
  void pyramidWithSideLengthHeightOne_getSideTriangle_baseAndHeightAreCorrect() {
    Pyramid pyramid = new Pyramid(1, 1);

    IsoscelesTriangle sideTriangle = pyramid.getSideTriangle();

    assertThat(sideTriangle.getBase()).isEqualTo(1);
    assertThat(sideTriangle.getHeight()).isEqualTo(Math.sqrt(1.25));
  }

  @Test
  void pyramidWithSideLengthHeightTwo_getSideTriangle_baseAndHeightAreCorrect() {
    Pyramid pyramid = new Pyramid(2, 2);

    IsoscelesTriangle sideTriangle = pyramid.getSideTriangle();

    assertThat(sideTriangle.getBase()).isEqualTo(2);
    assertThat(sideTriangle.getHeight()).isEqualTo(Math.sqrt(5));
  }

  @Test
  void pyramidWithSideLengthHeightOne_getSideEdge_isSquareRootOfOnePointFive() {
    Pyramid pyramid = new Pyramid(1, 1);

    double sideEdge = pyramid.getSideEdge();

    assertThat(sideEdge).isEqualTo(Math.sqrt(1.5));
  }

  @Test
  void pyramidWithSideLengthOneHeightTwo_getSideEdge_isSquareRootOfFourPointFive() {
    Pyramid pyramid = new Pyramid(1, 2);

    double sideEdge = pyramid.getSideEdge();

    assertThat(sideEdge).isEqualTo(Math.sqrt(4.5));
  }

  @Test
  void pyramidWithSideLengthHeightOne_getVolume_isOneThird() {
    Pyramid pyramid = new Pyramid(1, 1);

    double volume = pyramid.getVolume();

    assertThat(volume).isEqualTo(1.0 / 3.0);
  }

  @Test
  void pyramidWithSideLengthHeightTwo_getVolume_isEightThirds() {
    Pyramid pyramid = new Pyramid(2, 2);

    double volume = pyramid.getVolume();

    assertThat(volume).isEqualTo(8.0 / 3.0);
  }

  @Test
  void pyramidWithSideLengthHeightOne_getSurfaceArea_isCorrect() {
    Pyramid pyramid = new Pyramid(1, 1);

    double surfaceArea = pyramid.getSurfaceArea();

    assertThat(surfaceArea).isEqualTo(Math.sqrt(1.25) * 2 + 1);
  }

  @Test
  void pyramidWithSideLengthHeightTwo_getSurfaceArea_isCorrect() {
    Pyramid pyramid = new Pyramid(2, 2);

    double surfaceArea = pyramid.getSurfaceArea();

    assertThat(surfaceArea).isEqualTo(Math.sqrt(5) * 4 + 4);
  }

  @Test
  void pyramidWithSideLengthHeightOne_getTotalEdgeLength_isCorrect() {
    Pyramid pyramid = new Pyramid(1, 1);

    double totalEdgeLength = pyramid.getTotalEdgeLength();

    assertThat(totalEdgeLength).isEqualTo(4 + 4 * Math.sqrt(1.5));
  }

  @Test
  void pyramidWithSideLengthOneHeightTwo_getTotalEdgeLength_isCorrect() {
    Pyramid pyramid = new Pyramid(1, 2);

    double totalEdgeLength = pyramid.getTotalEdgeLength();

    assertThat(totalEdgeLength).isEqualTo(4 + 4 * Math.sqrt(4.5));
  }
}
