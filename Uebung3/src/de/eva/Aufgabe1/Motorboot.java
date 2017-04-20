package de.eva.Aufgabe1;

public class Motorboot extends Boot {
  private boolean motorStatus;
  private int ps;

  public Motorboot(int knoten, float fleacheDeck, int anzKanonen, int ps) {
    super(knoten, fleacheDeck, anzKanonen);
    this.ps = ps;
  }

  public int getPS() {
    return ps;
  }

  public void setPS(int ps) {
    this.ps = ps;
  }

  public boolean getMotorStatus() {
    return motorStatus;
  }

  public void setMotorStatus(boolean motorStatus) {
    this.motorStatus = motorStatus;
  }

  private void stelleMotorAn() {
    System.out.println("Motor wird angestellt.");
    this.motorStatus = true;
  }

  public void stelleMotorAus() {
    System.out.println("Motor wird ausgestellt.");
    this.motorStatus = false;
  }

  @Override
  public void beschleunigen() {
    stelleMotorAn();
    super.setKnoten(30);
    System.out.println("Motor an und beschleunigt: " + super.getKnoten());
  }
}
