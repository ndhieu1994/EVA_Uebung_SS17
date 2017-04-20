package de.eva.Aufgabe1;

public class Segelboot extends Boot {

  private int anzSegel;

  public Segelboot(int knoten, float fleacheDeck, int anzKanonen, int anzSegel) {
    super(knoten, fleacheDeck, anzKanonen);
    this.anzSegel = anzSegel;
  }

  public int getAnzSegel() {
    return anzSegel;
  }

  private void segelHissen() {
    System.out.println("Segel wurde gehisst");
  }

  private void segelEinholen() {
    System.out.println("Segel wurde eingeholt.");
    this.setKnoten(0);
  }

  @Override
  public void beschleunigen() {
    this.segelHissen();
    this.setKnoten(22);
    System.out.println("Segelboot nimmt fahrt auf");
  }
}
