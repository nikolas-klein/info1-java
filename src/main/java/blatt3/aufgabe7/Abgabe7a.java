package blatt3.aufgabe7;
public class Abgabe7a {

    public static void wende(int[] a) {

        int v;
        int n = a.length;
        for (int i = 0; i < n / 2; i++) {
            v = a[i];
            a[i] = a[n - 1 - i];
            a[n - 1 - i] = v;
        }
    }
}
