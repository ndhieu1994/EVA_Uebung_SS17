package de.eva.Aufgabe1Thread;

public class PingPong extends Thread {
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
