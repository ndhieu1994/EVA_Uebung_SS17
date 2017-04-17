package de.eva.Aufgabe2;

import java.util.ArrayList;
import java.util.List;

public class PrimeCalculator {

  public static List<Integer> getPrimesUntil(int lastValue) {
    ArrayList<Integer> primes = new ArrayList<>();
    primes.add(2);
    int y = 3;
    int x;
    do {
      x = 3;
      while (x < y) {
        if (y % x == 0) {
          break;
        }
        x = x + 1;
      }
      if (x == y) {
        primes.add(y); // Primzahl gefunden, Zahl zu Liste hinzufügen
      }
      y = y + 2; // nur ungerade Zahlen prüfen!
    } while (y <= lastValue);
    return primes;
  }

  public static void main(String[] args) {
    List<Integer> mylist = getPrimesUntil(20);
    for (Integer integer : mylist) {
      System.out.println(integer);
    }
  }
}
