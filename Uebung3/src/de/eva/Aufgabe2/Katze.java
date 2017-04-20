package de.eva.Aufgabe2;

public class Katze extends Tier implements IVierbeiner, IInteraktion {

  public Katze(String name) {
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
    if (name.equals("Katzenfutter")) {
      System.out.println("Lecker, Katzenfutter.");
    } else {
      System.out.println("Ih.");
    }
  }

  @Override
  public void angucken() {
    System.out.println(super.getName() + " guckt dich an.");
  }
}
