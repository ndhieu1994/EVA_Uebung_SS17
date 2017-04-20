package de.eva.Aufgabe2;

public class Putzerfisch extends Tier implements IFische, IInteraktion {

  public Putzerfisch(String name) {
    super(name);
  }

  @Override
  public void angucken() {
    System.out.println(super.getName() + " guckt dich an.");
  }

  @Override
  public void fuettern(String name) {
    if (name.equals("Fischfutter")) {
      System.out.println("Lecker Essen!");
    } else {
      System.out.println("Ih!");
    }
  }

  @Override
  public void aquariumReinigen() {
    System.out.println("Fisch putzt selbst.");
  }
}
