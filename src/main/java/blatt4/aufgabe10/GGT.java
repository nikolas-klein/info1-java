package blatt4.aufgabe10;

public class GGT {
		public static int ggt(int n, int m) {
			if (n < m) return ggt(m,n);
			if (n == m) return m;
			else return ggt(n-m, m);
		}
}
