package de.eva.woche4;

/**
 * Created by hieu on 27.04.17.
 */
public class Palindrome {
  public static boolean isPalindrome(String abc) {
    abc = abc.toLowerCase();
    String a = "";
    String[] chars = abc.split("");
    for (String z : chars) {
      a = z + a;
    }
    return abc.equals(a);
  }
}
