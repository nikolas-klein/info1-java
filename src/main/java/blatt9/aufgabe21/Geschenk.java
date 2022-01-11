package blatt9.aufgabe21;

import java.io.Serializable;

public class Geschenk implements Serializable {
  protected String Bezeichnung;
  protected Double Preis;
  protected Byte Prioritaet;

  public Geschenk(String bezeichnung, Double preis, Byte prioritaet) {
    Bezeichnung = bezeichnung;
    Preis = preis;
    Prioritaet = prioritaet;
  }

  public String getBezeichnung() {
    return Bezeichnung;
  }

  public void setBezeichnung(String bezeichnung) {
    Bezeichnung = bezeichnung;
  }

  public Double getPreis() {
    return Preis;
  }

  public void setPreis(Double preis) {
    Preis = preis;
  }

  public Byte getPrioritaet() {
    return Prioritaet;
  }

  public void setPrioritaet(Byte prioritaet) {
    Prioritaet = prioritaet;
  }

  @Override
  public String toString(){
    String out_str = "Geschenkbezeichnung: " + getBezeichnung() + "\n";
    out_str += "Preis: " + getPreis() + "\n";
    out_str += "Priorität: " + getPrioritaet() + "\n";
    return out_str;
  }
}
