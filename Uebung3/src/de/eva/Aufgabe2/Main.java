package de.eva.Aufgabe2;

import java.util.ArrayList;
import java.util.Random;

/**
 * Testet, ob alle Klassen implementiert wurden und
 * ueber entsprechende Schnittstellen verfuegen.
 * @author Marcel
 * @author Yves
 */
public class Main {
	
	public static void main(String[] args) {
		// erzeuge Liste, die als Elemente Tiere erwartet
		ArrayList<Tier> haustiere = new ArrayList<>();
		// Katze, Hund, Barbe und Putzerfisch erben von Tier 
		// und sind somit zusaetzlich auch vom Typ Tier
		// wodurch sie in die Liste haustiere eingefuegt werden koennen
		haustiere.add(new Putzerfisch("Putzerfisch Peter"));
		haustiere.add(new Barbe("Barbe Bibi"));
		haustiere.add(new Katze("Katze Karlo"));
		haustiere.add(new Hund("Hund Heike"));
		
		Random random = new Random();
		
		for (int i = 0; i < 4; i++) {
			System.out.println("\n**********");
			// ziehe zufaellig ein Tier aus der Liste
			int index = random.nextInt(haustiere.size());
			Tier tier = haustiere.get(index);
			
			System.out.println("Dieses Haustier wurde zufaellig aus der Liste gezogen:");
			// Es ist egal um welche konkrete Klasse es sich in der naechsten Zeile handelt
			// da alle Klassen vom Typ Tier sind und damit getName() implementieren.
			System.out.println(tier.getName());
			
			if (tier instanceof IInteraktion){
				// hier ist egal, ob Katze, Hund, Barbe oder Putzerfisch, 
				// alle sind besitzen die Schnittstellen aus IInteraktion
				((IInteraktion) tier).angucken();
				((IInteraktion) tier).fuettern("Katzenfutter");
			}			
			if (tier instanceof IVierbeiner){				
				// hier ist egal, ob Katze oder Hund, wegen IVierbeiner
				((IVierbeiner) tier).fuettern("Hundefutter");
				((IVierbeiner) tier).gassigehen();
				((IVierbeiner) tier).streicheln();
			}
			
			if (tier instanceof IFische){
				// hier ist es egal, ob Barbe oder Putzerfisch, wegen IFische
				((IFische) tier).fuettern("Fischfutter");
				((IFische) tier).aquariumReinigen();
			}
		}		
	}
}
