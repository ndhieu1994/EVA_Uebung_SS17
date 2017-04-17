package de.eva.Aufgabe1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Circle {
  private static final double PI = 3.1415;
  private double radius;

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getCircumference() {
    return 2 * PI * radius;
  }

  public double getSurfaceArea() {
    return PI * radius * radius;
  }

  public static void main(String[] args) {
    System.out.println("Circle Program");
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    double radius;
    try {
      System.out.print("Radius: ");
      radius = Double.valueOf(bf.readLine());
    } catch (Exception e) {
      System.err.println("Error: " + e);
      System.err.println("Radius is being set to 0");
      radius = 0;
    }
    Circle myCircle = new Circle();

    System.out.println("Radius is set to " + radius);
    myCircle.setRadius(radius);
    System.out.println("Circumference: " + myCircle.getCircumference());
    System.out.println("Surface Area: " + myCircle.getSurfaceArea());
  }
}
