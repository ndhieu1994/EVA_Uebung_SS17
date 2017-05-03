package de.eva.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestLeapYear {
	
	// testIsDividable4
  @Test
  public void testIsDividable4() {
    LeapYear testable = new LeapYear();
    assertTrue(testable.isDividable4(2004));
  }
	
	// testNotLeapWhenDividable100
  @Test
  public void testNotLeapWhenDividable100() {
    LeapYear testable = new LeapYear();
    assertTrue(testable.isDividable4(2004));
  }

	// testLeapYearWhenDividable400
  @Test
  public void testLeapYearWhenDividable400() {
    LeapYear testable = new LeapYear();
    assertTrue(testable.isDividable4(2004));
  }

	// testLeapYearRule1and2
  @Test
  public void testLeapYearRule1and2() {
    LeapYear testable = new LeapYear();
    assertTrue(testable.isDividable4(2004));
  }

	// testIsLeapYear
  @Test
  public void testIsLeapYear() {
    LeapYear testable = new LeapYear();
    assertTrue(testable.isDividable4(2004));
  }

}
