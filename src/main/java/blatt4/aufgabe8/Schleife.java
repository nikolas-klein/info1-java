package blatt4.aufgabe8;

public class Schleife {

	public static void main(String[] args) {
		int erg = 1;
		int i = 1;
		while (i < 10) {
			erg = erg * i;
			System.out.println(i + "! ist " + erg);
			i++;
		}
	}
}
