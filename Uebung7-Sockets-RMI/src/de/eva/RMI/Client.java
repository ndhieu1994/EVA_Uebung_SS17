package de.eva.RMI;

import java.io.IOException;
import java.rmi.NotBoundException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;


public class Client {

  public static void main(String[] args) throws NotBoundException, IOException {

    /// TODO: Registry holen!
    Registry myRegistry = LocateRegistry.getRegistry("localhost", Registry.REGISTRY_PORT);

    /// TODO: Objekt in Registry nachschlagen!
    WeatherService myWeatherService = (WeatherService) myRegistry.lookup("WeatherService");

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
        String dayWeather = myWeatherService.getWeatherByDay(day);
        System.out.println(dayWeather);
      } else if (wahl == 2) {
        /// TODO: getAmountOfRain() beim Server aufrufen und Ergebnis ausgeben!
        System.out.println("amount: " + myWeatherService.getAmountOfRain());
      } else if (wahl == 3) {
        System.out.println("Fuer welchen Tag?");
        String day = eingabe.nextLine();
        System.out.println("Fuer welche Stunde?");
        int hour = eingabe.nextInt();
        eingabe.nextLine(); // gleiches Problem wie oben...
        /// TODO: getTemoerature beim Server aufrufen und Ergebnis ausgeben!
        int temp = myWeatherService.getTemperature(day, hour);
        System.out.println("temperatur: " + temp + "°C");
      } else if (wahl == 4) {
        break;
      }
      System.out.println("-------------------------------------");
    }

    eingabe.close();
  }

}
