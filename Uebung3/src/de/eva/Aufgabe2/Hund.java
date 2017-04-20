package de.eva.Aufgabe2;

public class Hund extends Tier implements IVierbeiner, IInteraktion {

  public Hund(String name) {
    super(name);
  }

  @Override
  public void gassigehen() {
    System.out.println("Mit Katzen geht man nicht Gassi.");
  }

  @Override
  public void streicheln() {
    System.out.println("Katze streicheln.");
  }

  @Override
  public void fuettern(String name) {
    if (name.equals("Hundefutter")) {
      System.out.println("Lecker, Hundefutter.");
    } else {
      System.out.println("Ih.");
    }
  }

  @Override
  public void angucken() {
    System.out.println(super.getName() + " guckt dich an.");
  }
}
