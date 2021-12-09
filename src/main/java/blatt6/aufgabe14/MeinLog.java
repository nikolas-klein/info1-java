package blatt6.aufgabe14;

public class MeinLog {

    public static double ln(double z) throws SchlechtesArgumentException{

        if(z<0) throw new SchlechtesArgumentException("Die Zahl muss größer als 0 sein");
        if(z == 0) return Double.NEGATIVE_INFINITY;
        if(z==Double.POSITIVE_INFINITY) return z;
        return berechneLn(z);

    }

    private static double berechneLn(double x) {
        x--;
        if (x > 1) {
            return -(berechneLn(1.d + (-(x / (x+1.d)))));
        }
        double ergebnis = 0;
        int n = 1;
        while (Math.abs((Math.pow((x), n)) / n) >= 0.000001) {
            ergebnis +=(Math.pow(x,n)/n)-(Math.pow(x,(n+1))/(n+1));
            n++;
        }
        return ergebnis;
    }

    private static double berechneLn2(double z) {
        if (z > 2.d) {
            double x = z - 1.d;
            return -berechneLn2(1.d + (-(x/(x + 1.d))));
        } else {
            double x = z - 1.d;
            double sum = 0.0;
            double n = 1.d;
            boolean odd = true;
            while (Math.abs(Math.pow(x, n)/n) > 0.000001) {
                sum += odd ? (Math.pow(x, n)/n) : (-Math.pow(x, n)/n);
                odd = !odd;
                n++;
            }
            return sum;
        }
    }


}
