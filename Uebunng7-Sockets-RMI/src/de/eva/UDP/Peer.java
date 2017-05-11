package de.eva.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Ein Beispiel fuer Sockets und UDP.
 * Ein Peer haelt Dateien, die er anderen zur
 * Verfuegung stellt. Dazu sendet er an bestimmte 
 * Adressen und Ports, hinter denen er andere Peers 
 * vermutet, eine Nachricht. Diese entspricht einer 
 * Liste mit Namen der Dateien.
 * @author Marcel
 * @author Yves
 */
public class Peer{
		
	/** Liste mit Namen der Dateien */
	private ArrayList<String> files = new ArrayList<>();
	/** Port, an dem Peer selber auf Nachrchten wartet. */
	private int port;
	/** Socket fuer Kommunikation.*/
	private DatagramSocket socket;
	
	public Peer(int port) {
		try {						
			this.port = port;
			
			/// TODO: Erzeuge einen socket fuer den Peer!
			
			// Lies Liste mit Dateien ein
			this.inputFiles();		
			// Sende diese an alle Anderen
			this.shareFilesWithAll();
			// warte auf eingehende Nachrichten
			this.readMessage();
		} catch (SocketException e) {			
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
	
	
	/**
	 * Erwartet Eingaben auf der Konsole.
	 * Durch die Eingabe von  stop wird die Schleife beendet. 
	 */
	private void inputFiles(){
		Scanner eingabe = new Scanner(System.in);
		
		while(true){
			System.out.println("Datei: ");
			String input = eingabe.nextLine();
			if (input.equals("stop")){
				break;
			} else{
				files.add(input);
			}
		}
		
		eingabe.close();		
	}
	
	/** 
	 * Geht die Liste der Dateien durch und erzeugt
	 * daraus einen String. Einzelne Elemente werden 
	 * durch # getrennt.
	 * @return Nachricht z.B. Datei1#File2#
	 */
	private String messageFiles(){
		String ret = "";
		for (String msg : files){
			ret += msg + "#";
		}
		return ret;
	}
	
	/**
	 * Ruft Methode shareFiles(port) mit allen Ports auf,
	 * hinter denen ein weiterer Peer vermutet wird.
	 * @throws IOException
	 */
	public void shareFilesWithAll() throws IOException{						
        for (int i = 0; i < 10; i++) {
        	if (50000 + i == port){
        		// ich selber brauche mir die Nachricht nicht zu schicken :)
        		continue;
        	}
        	this.shareFiles(50000+i);	        
        }                       
	}
	
	/**
	 * Sendet Nachricht (Liste der Dateien, die der Peer kennt)
	 * an andere Peer, der evtl. hinter dem gegebenem Port steht.
	 * @param port Port eines anderen Peers.
	 * @throws IOException
	 */
	public void shareFiles(int port) throws IOException{
		/// TODO: IP Adresse anlegen. Wohin soll Packet geschickt werden?  
        
        
        // Zu sendende Nachricht
        String request = messageFiles();
        System.out.println("Ich sende: " + request + " an Port: " + port);
        
        /// TODO: DatagramPacket erstellen        
        
        
        /// TODO: Datagram senden
                               	
	}
	

	
	/**
	 * Wartet auf Nachrichten. Vergleicht Listen und tauscht 
	 * sich gegebenenfalls aus. 
	 * @throws IOException 
	 */	
	public void readMessage() throws IOException {				
		while (true){
			/// TODO: DatagramPacket fuer eingehende Nachricht erstellen
			
			/// TODO: Warte auf eingehende Nachricht
			
			/// TODO: Nachricht in einen String uwandeln			
		    String newFiles = ;
		    
		    // Nachricht aufsplitten (#) und in eine ArrayList konvertieren
		    String[] filesStr = newFiles.split("#");
		    ArrayList<String> liste = new ArrayList<>();
		    Collections.addAll(liste, filesStr);		        		        		        
		        
		    // Mir unbekannte Dateinamen meiner Liste hinzufuegen
		    for (String str : filesStr){
		    	if (! files.contains(str)){
		    		files.add(str);
		        }
		    }
		    
		    // Kenne ich mehr Dateinamen als der Andere?		      
		    if (! liste.containsAll(files)){
		    	// sende ihm meine Liste
		    	System.out.println("Ihm fehlt etwas...");
		    	/// TODO: An welchen Port muss ich die Nachricht senden? 
		    	int zielPort = ;
		        this.shareFiles(zielPort);
		    }
		        
		    System.out.println("Meine neue Liste: " + files.toString());
		}		
	}
	
	public static void main(String[] args){
		// Starte Programm mit Port 50000
		// dann starte ein weiteres und aendere vorher Port auf 50000 + i
		Peer eins = new Peer(50000);		
	}

}
