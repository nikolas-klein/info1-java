package blatt5.aufgabe13;

public abstract class Ausdruck {

	public abstract double evaluiere();
	
	public static void main(String[] args) {

		Ausdruck a1 = new Konstante(1.0);
		Ausdruck a2 = new Konstante(2.0);
		Ausdruck a3 = new Addition(a1, a2);
		Ausdruck a4 = new Subtraktion(a3, a2);
		System.out.println(a4.evaluiere());
	}
}
