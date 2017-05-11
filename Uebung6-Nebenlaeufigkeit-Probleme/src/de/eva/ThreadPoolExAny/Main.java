package de.eva.ThreadPoolExAny;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

  public static void main(String[] args) throws InterruptedException, ExecutionException {

    ExecutorService executor = Executors.newCachedThreadPool();

    ArrayList<Printer> printers = new ArrayList<>();

    printers.add(new Printer("Peter"));
    printers.add(new Printer("Paul"));
    printers.add(new Printer("Theresa"));
    printers.add(new Printer("Magda"));

    String name = executor.invokeAny(printers);

    executor.awaitTermination(100, TimeUnit.SECONDS);

    System.out.println("***************************");
    System.out.println(name);
    System.out.println("***************************");
  }

}
