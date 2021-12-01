package blatt5.aufgabe13;

public class Addition extends Ausdruck{

    protected Ausdruck summand1;
    protected Ausdruck summand2;

    public Addition(Ausdruck summand1, Ausdruck summand2) {
        this.summand1 = summand1;
        this.summand2 = summand2;
    }

    @Override
    public double evaluiere() {
        return (summand1.evaluiere()+ summand2.evaluiere());
    }
}
