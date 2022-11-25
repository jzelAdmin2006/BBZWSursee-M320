package tech.bison.trainee2021.m320_testing.weekDayExample;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class WeekDayCalculatorTest {
  @Test
  void twentyFifthOfOctoberTwoThousandTwentyOne_getWeekDayAccordingToGivenAlgorithm_isMonday() {
    WeekDayCalculator weekDayCalculator = new WeekDayCalculator();

    String result = weekDayCalculator.getWeekDayAccordingToGivenAlgorithm(25, 10, 2021);

    assertThat(result).isEqualTo("MONDAY");
  }

  @Test
  void twentyFourthOfDecemberNineTeenHundredEighty_getWeekDayAccordingToGivenAlgorithm_isWednesday() {
    WeekDayCalculator weekDayCalculator = new WeekDayCalculator();

    String result = weekDayCalculator.getWeekDayAccordingToGivenAlgorithm(24, 12, 1980);

    assertThat(result).isEqualTo("WEDNESDAY");
  }

  @Test
  void seventhOfAprilTwoThousandThirtySeven_getWeekDayAccordingToGivenAlgorithm_isTuesday() {
    WeekDayCalculator weekDayCalculator = new WeekDayCalculator();

    String result = weekDayCalculator.getWeekDayAccordingToGivenAlgorithm(7, 4, 2037);

    assertThat(result).isEqualTo("TUESDAY");
  }

  @Test
  void twentyFifthOfOctoberTwoThousandTwentyOne_getWeekDay_isMonday() {
    WeekDayCalculator weekDayCalculator = new WeekDayCalculator();

    String result = weekDayCalculator.getWeekDay(25, 10, 2021);

    assertThat(result).isEqualTo("MONDAY");
  }

  @Test
  void twentyFourthOfDecemberNineTeenHundredEighty_getWeekDay_isWednesday() {
    WeekDayCalculator weekDayCalculator = new WeekDayCalculator();

    String result = weekDayCalculator.getWeekDay(24, 12, 1980);

    assertThat(result).isEqualTo("WEDNESDAY");
  }

  @Test
  void seventhOfAprilTwoThousandThirtySeven_getWeekDay_isTuesday() {
    WeekDayCalculator weekDayCalculator = new WeekDayCalculator();

    String result = weekDayCalculator.getWeekDay(7, 4, 2037);

    assertThat(result).isEqualTo("TUESDAY");
  }
}
