package blatt8.aufgabe19;

public class Zip {

	private static int[] a = {1,2,3,4,5};
	private static int[] b = {5,7,3,2,8};

    public static int[] zip(int[] a, int[] b, IntArr2Int intArr2Int){
        int[] erg = new int[Math.min(a.length, b.length)];
        for (int i=0; i<a.length && i<b.length; i++){
            erg[i] = intArr2Int.ia2i(a[i], b[i]);
        }
        return erg;
    }

    public static void main(String argv[]){
        int[] c = zip(a, b, (x,y) -> x*y);
        zip(a,b, (x,y) -> {System.out.println(x + "*" + y + "=" + (x*y)); return x*y;});
    }

    @FunctionalInterface
    public interface IntArr2Int {
        int ia2i(int a, int b);
    }

}
