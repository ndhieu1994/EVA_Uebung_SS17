package de.eva.ZusatzAufgabe2;

import java.util.ArrayList;

public class PrimeCalculatorTime {
  public static double getPrimesUntil(int lastValue) {
    long start = System.currentTimeMillis();
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
    long stop = System.currentTimeMillis();
    return (stop - start) / (double) 1000;
  }

  public static double sieveOfEratosthenes(int lastValue) {
    long start = System.currentTimeMillis();

    boolean[] primes = new boolean[lastValue+1];
    primes[0] = false;
    primes[1] = false;
    for (int i = 2; i < primes.length; i++) {
      primes[i] = true;
    }

    for (int i = 2; i <= Math.sqrt(lastValue); i++) {
      if (primes[i]) {
        for (int j = i * i; j <= lastValue; j += i) {
          primes[j] = false;
        }
      }
    }

    ArrayList<Integer> primesList = new ArrayList<>();
    for (int a = 2; a < primes.length; a++) {
      if (primes[a]) {
        primesList.add(a);
      }
    }

    long stop = System.currentTimeMillis();
    return (stop - start) / (double) 1000;
  }

  public static void main(String[] args) {
    int maxtesting = 100000;

    System.out.println("Naive Prime searching");
    for (int i = 10; i <= maxtesting; i *= 10) {
      System.out.println(i + ": " + getPrimesUntil(i));
    }

    System.out.println("Sieve of Eratosthenes");
    for (int i = 10; i <= maxtesting; i *= 10) {
      System.out.println(i + ": " + sieveOfEratosthenes(i));
    }
  }
}
