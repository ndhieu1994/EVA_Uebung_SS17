package de.eva.RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

/// TODO: Schnittstelle zu einem RemoteInterface vervollstaendigen!
public interface WeatherService extends Remote {

  public String getWeatherByDay(String day) throws RemoteException;

  public float getAmountOfRain() throws RemoteException;

  public int getTemperature(String day, int hour) throws RemoteException;
}
