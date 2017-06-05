package de.eva.RMI;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.RemoteServer;
import java.rmi.server.UnicastRemoteObject;


public class Server {

  public static void main(String[] args) throws RemoteException {

    /// TODO: Registry erzeugen!
    Registry reg = LocateRegistry.createRegistry(Registry.REGISTRY_PORT);

    /// TODO: Objekt exportieren!
    WeatherForecast myWeatherForecast = new WeatherForecast();
    WeatherService weatherService =
      (WeatherService) UnicastRemoteObject.exportObject(myWeatherForecast, 0);

    /// TODO: Objekt der Registry unter einem Namen bekannt machen!
    reg.rebind("WeatherService", weatherService);

    System.out.println(reg.toString());
    RemoteServer.setLog(System.out);
  }

}
