package blatt7.aufgabe17;

public class Schiff {

  private int maxGewichtInT;
  private double maxM3Volumen;

  public Schiff(int maxGewichtInT, double maxM3Volumen) {
    this.maxGewichtInT = maxGewichtInT;
    this.maxM3Volumen = maxM3Volumen;
  }

  public int getMaxGewichtInT() {
    return this.maxGewichtInT;
  }
  public double getMaxM3Volumen() {
    return this.maxM3Volumen;
  }
}
