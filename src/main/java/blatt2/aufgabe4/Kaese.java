package blatt2.aufgabe4;

public class Kaese {
    
    private float preis;
    private float menge;

    public Kaese(float preis, float menge){
        this.preis = preis;
        this.menge = menge;
    }

    public float getPreis() {
        return preis;
    }

    public void setPreis(float preis) {
        this.preis = preis;
    }

    public float getMenge() {
        return menge;
    }

    public void setMenge(float menge) {
        this.menge = menge;
    }
}
