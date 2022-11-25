package junitTestExample;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class MathsHandlerTest {
  @Test
  void oneAndOne_add_isTwo() {
    MathsHandler mathsHandler = new MathsHandler();

    int result = mathsHandler.add(1, 1);

    assertThat(result).isEqualTo(2);
  }

  @Test
  void twoAndTwo_add_isFour() {
    MathsHandler mathsHandler = new MathsHandler();

    int result = mathsHandler.add(2, 2);

    assertThat(result).isEqualTo(4);
  }

  @Test
  void fiveAndThree_subtract_isTwo() {
    MathsHandler mathsHandler = new MathsHandler();

    int result = mathsHandler.subtract(5, 3);

    assertThat(result).isEqualTo(2);
  }
}
