package de.eva.Aufgabe1Runnable;

public class PingPong implements Runnable {
  private String msg;

  public PingPong(String msg) {
    this.msg = msg;
  }

  @Override
  public void run() {
    for (int i = 0; i < 1000; i++) {
      System.out.println(msg);
    }
  }
}
