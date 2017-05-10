package de.eva.ZusatzaufgabeMD5;

import java.security.NoSuchAlgorithmException;

public class Md5CollisionFinder extends Thread {

  private int lowerBound, upperBound;
  private Md5Hash hash;

  public Md5CollisionFinder(int lowerBound, int upperBound, Md5Hash hash) {
    this.lowerBound = lowerBound;
    this.upperBound = upperBound;
    this.hash = hash;
  }

  public int findCollision() throws NoSuchAlgorithmException{
    Md5Calculator calc = new Md5Calculator();
    for(int i = lowerBound; i <= upperBound; i++){
      Md5Hash calculatedHash = calc.getHash(i);
      boolean isCollision = hash.equals(calculatedHash);
      if(isCollision){
        return i;
      }
    }
    String message = String.format("collision not found in interval [%d,%d]", lowerBound, upperBound);
    throw new IllegalArgumentException(message);
  }

  @Override
  public void run() {
    try {
      System.out.println("found collision: " + findCollision());
    } catch (NoSuchAlgorithmException e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) throws NoSuchAlgorithmException, InterruptedException {

    int n = Integer.MAX_VALUE;
    int numberOfThreads = 2;
    Thread[] finderThreads = new Thread[numberOfThreads];


    Md5Hash hash = new Md5Hash(8248337957008271949L, 7217552169022328908L);
    //Md5CollisionFinder finder = new Md5CollisionFinder(0, Integer.MAX_VALUE, hash);
    long start = System.currentTimeMillis();
    for (int i = 0; i < numberOfThreads; i++) {
      finderThreads[i] = new Md5CollisionFinder(
        i * (n / numberOfThreads),
        (i + 1) * (n / numberOfThreads),
        hash);
    }

    for (Thread t : finderThreads) {
      t.start();
    }

    for (Thread t : finderThreads) {
      t.join();
    }

   long stop = System.currentTimeMillis();
    long time = stop - start;
    System.out.println("time taken: " + time + "ms");
  }
}