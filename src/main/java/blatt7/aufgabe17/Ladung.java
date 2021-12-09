package blatt7.aufgabe17;

public class Ladung {

  private int gewichtInKG;
  private int preis;
  private double volumenCM3;

  public Ladung(int preis, int gewichtInKG, double volumenCM3) {
    this.preis = preis;
    this.gewichtInKG = gewichtInKG;
    this.volumenCM3 = volumenCM3;
  }

  public int getPreis() {
    return preis;
  }
  public int getGewichtInKG() {
    return gewichtInKG;
  }
  public double getVolumenCM3() {
    return volumenCM3;
  }

}
