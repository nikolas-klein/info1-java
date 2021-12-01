package blatt5.aufgabe12;

public class Haupt {

	public static void main(String[] args) {

		Kugel kugel = new Kugel(2.0);
		Quader quader = new Quader(2.0, 3.0 ,4.0);
		
		System.out.println("Volumen Quader: " + quader.volumen() + "Volumen Kugel: " + kugel.volumen());


	}
	
}
