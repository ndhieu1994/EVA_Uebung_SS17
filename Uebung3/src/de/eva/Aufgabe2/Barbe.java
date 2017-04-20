package de.eva.Aufgabe2;

public class Barbe extends Tier implements IFische, IInteraktion {

  public Barbe(String name) {
    super(name);
  }

  @Override
  public void aquariumReinigen() {
    System.out.println("Aquarium wird gereinigt.");
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
}
