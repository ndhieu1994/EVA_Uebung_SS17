package de.eva.ThreadPoolCached;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

  public static void main(String[] args) throws InterruptedException {

    ExecutorService executor = Executors.newCachedThreadPool();

    executor.execute(new Printer("Peter"));
    executor.execute(new Printer("Paul"));
    executor.execute(new Printer("Heike"));

    Thread.sleep(2000);

    System.out.println("***********************************");

    executor.execute(new Printer("Theresa"));
    executor.execute(new Printer("Magda"));

    executor.shutdown();
    executor.awaitTermination(100, TimeUnit.SECONDS);
    System.out.println("END");
  }

}
