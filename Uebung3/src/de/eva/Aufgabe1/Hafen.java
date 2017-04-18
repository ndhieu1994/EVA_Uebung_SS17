package de.eva.Aufgabe1;

/**
 * Zum Testen der beiden Klassen.
 * @author Marcel
 * @author Yves
 */
public class Hafen {
	
	public static void main(String[] args) {				
		Boot bootS = new Segelboot(0, 10, 5, 3);
		Boot bootM = new Motorboot(0, 10, 5, 100);		
		
		bootS.beschleunigen();
		bootM.beschleunigen();
		
		System.out.println("bootS hat " + bootS.getKnoten() + " Knoten.");
		System.out.println("bootM hat " + bootM.getKnoten() + " Knoten.");
		
		Segelboot sb = (Segelboot) bootS;
		Motorboot sm = (Motorboot) bootM;
	
		System.out.println("Anzahl Segel vom Segelboot: " + sb.getAnzSegel());
		System.out.println("Anzahl PS vom Motorboot: " + sm.getPS());
		System.out.println("Status des Motors vom Motorboot: " + sm.getMotorStatus());
		
		System.out.println("\nStarte Motorsegelboot: ");
		Motorsegelboot msb = new Motorsegelboot(0, 200, 13, 5, 200);
		msb.beschleunigen();
		System.out.println("Anzahl Segel: " + msb.getAnzSegel());
		System.out.println("Status vom Motor: " + msb.getMotorStatus());
	}
}
