package de.eva.ThreadPoolExAny;

import java.util.Random;
import java.util.concurrent.Callable;

public class Printer implements Callable<String> {

  private String name;
  private Random r = new Random();

  public Printer(String name) {
    this.name = name;
  }

  @Override
  public String call() throws Exception {
    for (int i = 0; i < r.nextInt(10000); i++) {
      System.out.println(name + " is running");
    }
    return this.name;
  }
}
