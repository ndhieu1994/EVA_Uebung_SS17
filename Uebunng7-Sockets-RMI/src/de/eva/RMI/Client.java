package de.eva.RMI;

import java.io.IOException;
import java.rmi.NotBoundException;
import java.util.Scanner;


public class Client {

  public static void main(String[] args) throws NotBoundException, IOException {

    /// TODO: Registry holen!

    /// TODO: Objekt in Registry nachschlagen!

    Scanner eingabe = new Scanner(System.in);
    while (true) {
      System.out.println("Willkommen beim WetterService, was moechten Sie wissen?");
      System.out.println("1 - Wettervorhersage fuer einen Tag");
      System.out.println("2 - Niederschlagsmenge?");
      System.out.println("3 - Temperatur fuer einen Tag zu einer bestimmten Zeit?");
      System.out.println("4 - Ende.");
      int wahl = eingabe.nextInt();

      // nextInt liest nur Zahl, aber nicht den Zeilenumbruch...
      // uebrig bleibt eine leere Zeichenkette, die muss weg
      eingabe.nextLine();

      if (wahl == 1) {
        System.out.println("Fuer welchen Tag?");
        String day = eingabe.nextLine();
        /// TODO: getWeatherByDay(day) beim Server aufrufen und Ergebnis ausgeben!

      } else if (wahl == 2) {
        /// TODO: getAmountOfRain() beim Server aufrufen und Ergebnis ausgeben!

      } else if (wahl == 3) {
        System.out.println("Fuer welchen Tag?");
        String day = eingabe.nextLine();
        System.out.println("Fuer welche Stunde?");
        int hour = eingabe.nextInt();
        eingabe.nextLine(); // gleiches Problem wie oben...
        /// TODO: getTemoerature beim Server aufrufen und Ergebnis ausgeben!

      } else if (wahl == 4) {
        break;
      }
      System.out.println("-------------------------------------");
    }

    eingabe.close();
  }

}
