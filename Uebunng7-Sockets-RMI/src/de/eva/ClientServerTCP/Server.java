package de.eva.ClientServerTCP;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	public static void main(String[] args) throws IOException {
		
		int port = 50000;	
		
		/// TODO: Ein Objekt von WeatherForecast instanziieren!
		
		
		/// TODO: Serversocket an Port binden
		
		
		while (true) {
            
    		System.out.println("Server is listening on port " + welcomeSocket.getLocalPort() + "...");
            
    		/// TODO: Auf eingehende Verbindung warten!
    		
    		System.out.println("Incoming client request from " + einClient.getInetAddress().getHostName() + "!");
    		
    		/// TODO: Kommunikationskanäle erstellen (channelFromClient, ChannelToClient)!
    		
    		
//    		Anfrage entgegen nehmen
    		String msg = "";
    		while(msg.lastIndexOf("###") == -1) {
                msg += (char)channelFromClient.read();
            }
    		msg = msg.replace("###", "");
            
            System.out.println("Message is: " + msg);
            
            String result = handleRequest(msg, wf);
            result += "###";
            
            /// TODO: Antwort zum Client in Stream schreiben!
            
            
            /// TODO: Kommunikationskanaele abbauen und ClientSocket schliessen!
            
            
            
            System.out.println("Release socket...\n");                        
		}
		
		// System.out.println("Release serversocket...");
		// welcomeSocket.close();
	}	
	
	private static String handleRequest(String msg, WeatherForecast wf){
		if (msg.startsWith("weather")){
			String[] elements = msg.split("#");
			if (elements.length == 2){
				return wf.getWeatherByDay(elements[1]);
			}
			return "Wrong Parameter";
			
		} else if (msg.startsWith("amount")){
			/// TODO: Richtige Methode aufrufen und Wert zurueckgeben!
			
		} else if (msg.startsWith("temp")){
			/// TODO: Richtige Methode aufrufen und Wert zurueckgeben, Parameter beachten!			
		}
		return "Command not listed in Protocol!";		
	}

}
