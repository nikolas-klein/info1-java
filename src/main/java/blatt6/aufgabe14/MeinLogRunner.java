package blatt6.aufgabe14;

public class MeinLogRunner {
    public static void main(String[] args) {
        try {
            System.out.println(MeinLog.ln(0));
            System.out.println(MeinLog.ln(4));
            System.out.println(MeinLog.ln(1));
            System.out.println(MeinLog.ln(Double.POSITIVE_INFINITY));
            System.out.println(MeinLog.ln(-1));
            System.out.println(MeinLog.ln(Double.NEGATIVE_INFINITY));
            System.out.println("test");
        } catch (SchlechtesArgumentException e) {
            e.printStackTrace();
        }
    }
}
