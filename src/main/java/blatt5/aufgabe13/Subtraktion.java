package blatt5.aufgabe13;

public class Subtraktion extends Ausdruck {

    protected Ausdruck subtrahend;
    protected Ausdruck minuend;

    public Subtraktion(Ausdruck minuend, Ausdruck subtrahend) {
        this.subtrahend = subtrahend;
        this.minuend = minuend;
    }

    @Override
    public double evaluiere() {
        return minuend.evaluiere() - subtrahend.evaluiere();
    }
}
