package tech.bison.trainee2021.m320_testing.weekDayExample;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class WeekDayCalculator {
  public String getMessage(int day, int month, int year, String weekDay) {
    return String.format("Der %s.%s.%s ist ein %s.", day, month, year, weekDay);
  }

  public String getWeekDay(int day, int month, int year) {
    LocalDate localDate = LocalDate.of(year, month, day);
    DayOfWeek dayOfWeek = localDate.getDayOfWeek();
    String weekDay = dayOfWeek.name();
    System.out.println(getMessage(day, month, year, weekDay));
    return weekDay;
  }

  public String getWeekDayAccordingToGivenAlgorithm(int day, int month, int year) {
    int h = calculateWeekDayNumberWithGivenAlgorithm(day, month, year);
    DayOfWeek dayOfWeek = DayOfWeek.of(h);
    String weekDay = dayOfWeek.name();
    System.out.println(getMessage(day, month, year, weekDay));
    return weekDay;
  }

  private int calculateWeekDayNumberWithGivenAlgorithm(int day, int month, int year) {
    if (month <= 2) {
      month += 10;
      year--;
    } else {
      month -= 2;
    }
    int c = year / 100;
    year = year % 100;
    int h = ((((26 * month - 2) / 10) + day + (int) (1.25 * year) + c / 4 - 2 * c) % 7);
    if (h < 0) {
      h += 7;
    }
    return h;
  }
}
