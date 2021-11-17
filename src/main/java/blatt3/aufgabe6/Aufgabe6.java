package blatt3.aufgabe6;

public class Aufgabe6 {

  public static String dual(int x) {
    String result = "";
    int potenz = 1;
    for (int i=0; i<32; i++) {
      result = ((x & potenz) > 0) ? 1 + result : 0 + result;
      potenz <<=1;
    }
    return result;
  }

      public static void main(String[] args){
        System.out.println("a) "+Integer.toBinaryString(-17)+"\n");
        System.out.println("b) "+Integer.parseUnsignedInt("11111111111111111111111111101010",2)+"\n");
        System.out.println("c) "+ (54&42));
        System.out.println(54|42);
        System.out.println(52^42);
        System.out.println(42>>2);
        System.out.println(42<<3);
        System.out.println(42*8);
        System.out.println(~42+"\n");

        int x=7;
        if (x % 2 == 0) x ++; else x = x / 3;
        x = ( x > 2) ? 1/( x -2) : --x;
        x = ( x > 2 & x ++ < 4) ? x += 1 : (x -= 2);
        System.out.println("d) "+x+"\n");
        System.out.println("e) (! b) || ((b |= (((2 * y) >> 1) > 0)) && ((- 1) < y)) \n");
        sechsf();
      }

      public static void sechsf(){
        double x=0.3;
        double y=0.4;
        double z=3;
        System.out.println(x*y*z);
        System.out.println(z*x*y);
  }
}
