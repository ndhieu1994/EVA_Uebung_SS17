package de.eva.Aufgabe1;

public abstract class Boot {
  private int knoten;
  private float fleacheDeck;
  private int anzKanonen;

  public Boot () {}

  public Boot(int knoten, float fleacheDeck, int anzKanonen) {
    this.knoten = knoten;
    this.fleacheDeck = fleacheDeck;
    this.anzKanonen = anzKanonen;
  }

  public int getKnoten() {
    return knoten;
  }

  public void setKnoten(int knoten) {
    this.knoten = knoten;
  }

  public float getFleacheDeck() {
    return fleacheDeck;
  }

  public void setFleacheDeck(float fleacheDeck) {
    this.fleacheDeck = fleacheDeck;
  }

  public int getAnzKanonen() {
    return anzKanonen;
  }

  public void setAnzKanonen(int anzKanonen) {
    this.anzKanonen = anzKanonen;
  }

  public boolean ankerWerfen() {
    System.out.println("Anker wurde geworfen");
    return true;
  }

  public abstract void beschleunigen();
}
