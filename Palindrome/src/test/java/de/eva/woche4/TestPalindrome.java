package de.eva.woche4;

import static org.junit.Assert.*;
import org.junit.Test;
/**
 * Created by hieu on 27.04.17.
 */
public class TestPalindrome {

  @Test
  public void isPalindromeTrue() {
    Palindrome pal = new Palindrome();
    assertTrue(pal.isPalindrome("aba"));
  }

}
