package blatt2.aufgabe4;

public class Salat {
    
    private double preis;
    private double menge;

    public Salat(double preis, double menge){
        this.preis = preis;
        this.menge = menge;
    }

    public double getPreis() {
        return this.preis;
    }

    public void setPreis(float preis) {
        this.preis = preis;
    }

    public double getMenge() {
        return this.menge;
    }

    public void setMenge(float menge) {
        this.menge = menge;
    }
    
}
