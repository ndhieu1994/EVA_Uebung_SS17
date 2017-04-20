package de.eva.Aufgabe3;

public class EmailAddressFactory {

  public static EmailAddress createEmail(String email) {
    String[] atSplit = email.split("@");
    String prefix = atSplit[0];
    int lastdotindex = atSplit[1].lastIndexOf(".");
    String provider = atSplit[1].substring(0, lastdotindex);
    String domain = atSplit[1].substring(lastdotindex + 1);
    if (provider.contains("uni-leipzig")) {
      return new MailUniLeipzig(prefix, provider, domain);
    } else if (provider.contains("uni-england")) {
      return new MailUniEngland(prefix, provider, domain);
    } else {
      return new EmailAddress(prefix, provider, domain);
    }
  }

  public static EmailAddress createEmail(String prefix, String provider, String domain) {
    if (provider.contains("uni-leipzig")) {
      return new MailUniLeipzig(prefix, provider, domain);
    } else if (provider.contains("uni-england")) {
      return new MailUniEngland(prefix, provider, domain);
    } else {
      return new EmailAddress(prefix, provider, domain);
    }
  }
}
