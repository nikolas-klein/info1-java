package blatt4.aufgabe8;

public class Schleife2 {
	public static void main(String[] args){
		int erg = 1;
		int i = 1;
		do {
			erg = erg * i;
			System.out.println(i + "! ist " + erg);
			i++;
		} while(i<10);
	}
}
