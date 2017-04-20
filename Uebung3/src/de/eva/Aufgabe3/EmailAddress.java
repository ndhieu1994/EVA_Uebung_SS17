package de.eva.Aufgabe3;

public class EmailAddress {
  private String prefix;
  private String provider;
  private String domain;

  public EmailAddress(String prefix, String provider, String domain) {
    this.prefix = prefix;
    this.provider = provider;
    this.domain = domain;
  }

  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }

  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public String getFullEmailAddress() {
    return prefix + "@" + provider + "." + domain;
  }

  public boolean vergleicheAddressen(EmailAddress address) {
    boolean vergleich =
      this.prefix.equals(address.getPrefix()) &&
      this.provider.equals(address.getProvider()) &&
      this.domain.equals(address.getDomain());
    return vergleich;
  }
}
