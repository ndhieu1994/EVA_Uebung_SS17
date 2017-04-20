package de.eva.Aufgabe1;

public class Motorsegelboot extends Segelboot {

  private boolean motorStatus;
  private int ps;

  public Motorsegelboot(int knoten, float fleacheDeck, int anzKanonen, int anzSegel, int ps) {
    super(knoten, fleacheDeck, anzKanonen, anzSegel);
    this.ps = ps;
  }

  public boolean getMotorStatus() {
    return motorStatus;
  }
}
