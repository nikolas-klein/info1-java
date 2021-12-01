package beispiele;

import java.util.ArrayList;

public class beispiele {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach((n) -> {
            if (n > 5) {
                System.out.println(n);
            }
        });
    }
}
