package de.eva.junit;

public class LeapYear {

  // Regel 1
  public boolean isDividable4(int year) {
    return year % 4 == 0;
  }

  // Regel 2
  public boolean isNotDividable100(int year) {
    return year % 100 != 0;
  }

  // Regel 3
  public boolean isDividable400(int year) {
    return year % 400 == 0;
  }

  // isLeapYear?
  public boolean isLeapYear(int year) {
    return (isDividable4(year) && isNotDividable100(year)) || isDividable400(year);
  }
}
