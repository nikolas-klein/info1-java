package blatt5.aufgabe12;

public class Quader implements Form {
    protected double tiefe;
    protected double hoehe;
    protected double breite;

    public Quader(double tiefe, double hoehe, double breite) {
        this.tiefe = tiefe;
        this.hoehe = hoehe;
        this.breite = breite;
    }


    @Override
    public double volumen() {
        return tiefe*breite*hoehe;
    }
}
