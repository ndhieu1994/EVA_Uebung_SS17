package de.eva.ClientServerTCP;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

  public static void main(String[] args) throws IOException {

    int port = 50000;

    /// TODO: Ein Objekt von WeatherForecast instanziieren!
    WeatherForecast wf = new WeatherForecast();


    /// TODO: Serversocket an Port binden
    ServerSocket welcomeSocket = new ServerSocket(port);


    while (true) {

      System.out.println("Server is listening on port " + welcomeSocket.getLocalPort() + "...");

      /// TODO: Auf eingehende Verbindung warten!
      Socket einClient = welcomeSocket.accept();

      System.out
        .println("Incoming client request from " + einClient.getInetAddress().getHostName() + "!");

      /// TODO: Kommunikationskanaele erstellen (channelFromClient, ChannelToClient)!
      InputStream channelFromClient = new BufferedInputStream(einClient.getInputStream());
      OutputStream channelToClient = einClient.getOutputStream();


      //Anfrage entgegen nehmen
      String msg = "";
      while (msg.lastIndexOf("###") == -1) {
        msg += (char) channelFromClient.read();
      }
      msg = msg.replace("###", "");

      System.out.println("Message is: " + msg);

      String result = handleRequest(msg, wf);
      result += "###";

      /// TODO: Antwort zum Client in Stream schreiben!
      channelToClient.write(result.getBytes());


      /// TODO: Kommunikationskanaele abbauen und ClientSocket schliessen!
      channelFromClient.close();
      channelToClient.close();
      einClient.close();


      System.out.println("Release socket...\n");
    }

    // System.out.println("Release serversocket...");
    // welcomeSocket.close();
  }

  private static String handleRequest(String msg, WeatherForecast wf) {
    if (msg.startsWith("weather")) {
      String[] elements = msg.split("#");
      if (elements.length == 2) {
        return wf.getWeatherByDay(elements[1]);
      }
      return "Wrong Parameter";

    } else if (msg.startsWith("amount")) {
      /// TODO: Richtige Methode aufrufen und Wert zurueckgeben!
      return Float.toString(wf.getAmountOfRain());
    } else if (msg.startsWith("temp")) {
      /// TODO: Richtige Methode aufrufen und Wert zurueckgeben, Parameter beachten!
      String[] elements = msg.split("#");
      if (elements.length == 3) {
        String day = elements[1];
        int hour = Integer.parseInt(elements[2]);
        int temp = wf.getTemperature(day, hour);
        return "Es werden " + temp + "Grad";
      }
    }
    return "Command not listed in Protocol!";
  }

}
