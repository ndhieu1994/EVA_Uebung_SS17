package de.eva.RaceCondition;

/**
 * Beispiel fuer irgendeine komplexe Klasse.
 * Ein Objekt dieser Klasse wird von verschiedenen Thread benutzt.
 * @author Marcel
 * @author Yves
 */
public class KomplexeKlasse {
	 
	private int number;
	
	public KomplexeKlasse() {
		number = 0;
	}
	
	public int getNumber(){
		return number;
	}
	
	// ToDo: Möglichkeit 1: Realisiere Lock bei jedem Methodenaufruf
	// mit public synchronized void incNumber(){
	public void incNumber(){
		this.number++;
		// das ist keine atomare Operation, daher wird hier 
		// die RaceCondition auftreten,
		// falls kein Monitor eingesetzt wird!
	}
		
}
