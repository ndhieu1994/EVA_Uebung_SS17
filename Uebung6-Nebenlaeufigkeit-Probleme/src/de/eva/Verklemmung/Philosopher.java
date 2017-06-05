package de.eva.Verklemmung;

import java.util.Random;

/**
 * Beispiel fuer eine Verklemmung.
 * Nutzen mehrere Threads gemeinsam geteilte Objekte
 * und wird der Zugriff auf diese durch einen Monitor geregelt,
 * kann es zur Verklemmung kommen!
 *
 * @author Marcel
 * @author Yves
 */
public class Philosopher extends Thread {

  private ChopStick left;
  private ChopStick right;
  private String name;
  private Random r = new Random();

  public Philosopher(String name, ChopStick left, ChopStick right) {
    this.name = name;
    this.left = left;
    this.right = right;
  }

  @Override
  public void run() {
    while (true) {
      think();
      eat();
    }
  }

  public void think() {
    try {
      int millis = r.nextInt(100);
      // warte eine bestimtme Zeit und mache erst dann weiter
      Thread.sleep(millis * 10);
      System.out.println(this.name + " denkt nach...");
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public void eat() {
    while (true) {
      if (left.useWhenPossible()) {
        //left.useWhenPossible();
        System.out.println(this.name + "hat das linke Staebchen!");
        while (true) {
          if (right.useWhenPossible()) {
            //right.useWhenPossible();
            System.out.println(this.name + "hat beide Staebchen und isst!");
            right.putBackOnTable();
            left.putBackOnTable();
            break;
          }
          return;
        }
      } else {
        left.putBackOnTable();
      }
    }
  }

  public static void main(String[] args) {
    ChopStick cs1 = new ChopStick();
    ChopStick cs2 = new ChopStick();
    ChopStick cs3 = new ChopStick();
    ChopStick cs4 = new ChopStick();
    ChopStick cs5 = new ChopStick();

    Philosopher p1 = new Philosopher("Aristoteles", cs1, cs2);
    Philosopher p2 = new Philosopher("Kant", cs2, cs3);
    Philosopher p3 = new Philosopher("Platon", cs3, cs4);
    Philosopher p4 = new Philosopher("Popper", cs4, cs5);
    Philosopher p5 = new Philosopher("Nietzsche", cs5, cs1);

    p1.start();
    p2.start();
    p3.start();
    p4.start();
    p5.start();

  }
}
