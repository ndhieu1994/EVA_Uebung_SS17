package de.eva.Aufgabe3;

public class MailUniLeipzig extends EmailAddress implements SayHello {

  public MailUniLeipzig(String prefix, String provider, String domain) {
    super(prefix, provider, domain);
  }

  @Override
  public String sayHelloToStudent() {
    return "Welcome to the University of Leipzig.";
  }
}
