package blatt8.aufgabe19;

import java.lang.reflect.Array;

public class Map {

    private static int[] a = {1,2,3,4,5};
    public static int[] map(int[] a, Int2Int i2iIF){
        int[] erg = new int[a.length];
        for(int i=0; i<a.length; i++)
            erg[i] = i2iIF.i2i(a[i]);
        return erg;
    }

    public static int[] zip(int[] a, int[] b, IntArr2Int intArr2Int){
        int[] erg = new int[Math.min(a.length, b.length)];
        for (int i=0; i<a.length && i<b.length; i++){
            erg[i] = intArr2Int.ia2i(a[i], b[i]);
        }
        return erg;
    }

    public static <T> T[] ziped(T[] a, T[] b, TArra2T<T> ttArra2T){
        T[] erg = (T[]) Array.newInstance(a[0].getClass(), Math.min(a.length, b.length));
        for (int i=0; i<a.length && i<b.length; i++){
            erg[i] = ttArra2T.ia2i(a[i], b[i]);
        }
        return erg;
    }

    public static void main(String argv[]){
        Integer[] p = {1,2,3};
        String[] s = {"Test","Wahh", "LSP"};
        int[] b = map(a, i-> i*i);
        int[] c = zip(a,a, (x,y) -> x+y);
        zip(a,a, (x,y) -> {System.out.println(x + "+" + y + "=" + (x+y)); return x+y;});
        map(b, i-> {System.out.println(i); return i;});
        ziped(s,s,(l,k)-> l+k);
    }

    @FunctionalInterface
    public interface Int2Int {
        int i2i(int i);
    }

    @FunctionalInterface
    public interface IntArr2Int {
        int ia2i(int a, int b);
    }

    @FunctionalInterface
    public interface TArra2T<T> {
        T ia2i(T a, T b);
    }
}
