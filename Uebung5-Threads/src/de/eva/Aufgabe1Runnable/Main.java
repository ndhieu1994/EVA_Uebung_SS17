package de.eva.Aufgabe1Runnable;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		PingPong task1 = new PingPong("ping...");
		PingPong task2 = new PingPong("...pong");

		Thread ping = new Thread(task1);
		Thread pong = new Thread(task2);

		ping.start();
		pong.start();

		ping.join();
		pong.join();

	}

}
