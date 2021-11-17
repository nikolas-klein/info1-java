package blatt3.aufgabe7;

public class Abgabe7b {
	
	public static boolean doppelte(int[] a) {
		for(int i=0; i< a.length; i++)
			for(int j=i+1; j < a.length; j++)
				if (a[i] == a[j]) return true;
		return false;
	}
}
