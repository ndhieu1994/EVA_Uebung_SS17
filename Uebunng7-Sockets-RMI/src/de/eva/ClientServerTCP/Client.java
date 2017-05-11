package de.eva.ClientServerTCP;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		String host = "localhost";
		int port = 50000;
		
		/// TODO: Socket erstellen und verbinden!
		
		
		// Kommunikationskanaele erstellen
		InputStream channelFromServer = new BufferedInputStream(client.getInputStream());
        OutputStream channelToServer = client.getOutputStream();
        
//      Nachricht erstellen und versenden
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Message:");
        String msg = eingabe.nextLine();
        eingabe.close();
        msg += "###";
        
        /// TODO: Anfrage an Server senden!
        
        
//      Antwort entgegennehmen
        String response = "";        
		while(response.lastIndexOf("###") == -1) {
			response += (char)channelFromServer.read();
        }
		
//      Ausgabe der Antwort
        System.out.println(response.replace("###", ""));
        
        /// TODO: Kommunikationskanaele und Socket beenden
        
        
        
        System.out.println("Release socket...");
	}
	
}
