package de.eva.Aufgabe1Thread;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		Thread ping = new PingPong("ping...");
		Thread pong = new PingPong("...pong");

		ping.start();
		pong.start();

		ping.join();
		pong.join();

		System.out.println("Ende");
	}

}
