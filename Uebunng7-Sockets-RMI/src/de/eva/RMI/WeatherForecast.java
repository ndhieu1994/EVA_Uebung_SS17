package de.eva.RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class WeatherForecast implements WeatherService {

  @Override
  public String getWeatherByDay(String day) {
    switch (day) {
    case "mo":
      return "Am Montag wird es sonnig sein.";
    case "di":
      return "Am Dienstag ist es leicht bewoelkt.";
    case "mi":
      return "Am Mittwoch erwarten wir Schauer.";
    case "do":
      return "Am Donnerstag heftiges Gewitter. Beste Zeit, um etwas fuer EVA zu machen.";
    case "fr":
      return "Am Freitag wird es nass.";
    case "sa":
      return "Am Samstag wird es schoen.";
    case "so":
      return "Am Sonntag wissen wir es auch nicht. Schau einfach mal aus dem Fenster.";
    default:
      return "Diesen Tag kennen wir nicht.";
    }
  }

  @Override
  public float getAmountOfRain() {
    return 42.1337f;
  }

  @Override
  public int getTemperature(String day, int hour) {
    int temp = 0;
    switch (day) {
    case "mo":
      temp = 30;
      break;
    case "di":
      temp = 20;
      break;
    case "mi":
      temp = 13;
      break;
    case "do":
      temp = 10;
      break;
    case "fr":
      temp = 10;
      break;
    case "sa":
      temp = 19;
      break;
    case "so":
      temp = 17;
      break;
    default:
      return -1;
    }
    if (hour > 15) {
      return temp - 6;
    }
    return temp;
  }

}
