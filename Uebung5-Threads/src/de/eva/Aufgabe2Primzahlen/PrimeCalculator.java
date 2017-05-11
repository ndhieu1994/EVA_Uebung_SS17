package de.eva.Aufgabe2Primzahlen;

import java.util.ArrayList;

public class PrimeCalculator implements Runnable {
	
	private int firstValue;
	private int lastValue;
	private ArrayList<Integer> primelist = new ArrayList<>();
	
	public PrimeCalculator(int firstValue, int lastValue) {
		this.firstValue = firstValue;
		this.lastValue = lastValue;
	}

	public void getPrimesUntil(){
		if (firstValue < 3){
			System.out.println(2);
			firstValue = 3;
		}
		if (firstValue % 2 == 0){
			// nur ungerade Zahlen pruefen
			firstValue += 1;
		}
		int number = firstValue;
		int factor = 3;
		do {
			factor = 3;
			while (factor < number) {
				if (number % factor == 0) {
					break;
				}
				factor++;
			}
			if (factor == number) {
				//System.out.println(number);
				primelist.add(number);
			}
			number = number + 2;
		} while (number <= lastValue);
	}

	public ArrayList<Integer> getPrimelist() {
		return primelist;
	}

	@Override
	public void run() {
		getPrimesUntil();
	}

	public static void main(String args[]) {
		PrimeCalculator primcalc = new PrimeCalculator(0, 1000000);

		long startTime = System.currentTimeMillis();
		primcalc.getPrimesUntil();
		long endTime = System.currentTimeMillis();

		System.out.println("Dauer: " + (endTime - startTime) + "ms");
		// Beispiel Ausgabe fuer Intervall von 0 bis 100000:
		// Dauer: 4581ms

	}
}
