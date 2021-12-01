package blatt5.aufgabe13;

public class Konstante extends Ausdruck{

    protected double wert;

    public Konstante(double wert){
        this.wert = wert;
    }


    @Override
    public double evaluiere() {
        return wert;
    }
}
