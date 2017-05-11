package de.eva.Aufgabe2Primzahlen;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		// Erstelle alle Tasks fuer verschiedene Intervalle

		PrimeCalculator task1 = new PrimeCalculator(0, 25000);
		PrimeCalculator task2 = new PrimeCalculator(25001, 50000);
		PrimeCalculator task3 = new PrimeCalculator(50001, 75000);
		PrimeCalculator task4 = new PrimeCalculator(75001, 100000);

		// Erstelle Threads mit den jeweiligen Tasks
		Thread thread1 = new Thread(task1);
		Thread thread2 = new Thread(task2);
		Thread thread3 = new Thread(task3);
		Thread thread4 = new Thread(task4);

		
		long startTime = System.currentTimeMillis();
		// Starte das ganze ueber start()
    thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();

		// warte dann, bis alle Threads fertig sind
		thread1.join();
		thread2.join();
		thread3.join();
		thread4.join();

		// Wie lange hat es gedauert?
		long endTime = System.currentTimeMillis();		
		
		// Ausgabe der Zahlen
		for (int i : task1.getPrimelist()) {
			System.out.println(i);
		}
		for (int i : task2.getPrimelist()) {
			System.out.println(i);
		}
		for (int i : task3.getPrimelist()) {
			System.out.println(i);
		}
		for (int i : task4.getPrimelist()) {
			System.out.println(i);
		}

		System.out.println("Dauer: " + (endTime - startTime) + "ms");
		// Beispiel Ausgabe fuer Intervall von 0 bis 100000:
		// Dauer: 2007ms <- nebenlaeufig
		// Dauer: 4581ms <- ohne, wesentlich langsamer
	}
}
