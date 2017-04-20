package de.eva.Aufgabe3;

public class MailUniEngland extends EmailAddress implements SayHello {

  public MailUniEngland(String prefix, String provider, String domain) {
    super(prefix, provider, domain);
  }

  @Override
  public String sayHelloToStudent() {
    return "Welcome to the University of England.";
  }
}
