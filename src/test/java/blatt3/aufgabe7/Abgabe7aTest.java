package blatt3.aufgabe7;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class Abgabe7aTest {

  private int[] a = {1,3,5,7,8};
  private int[] ac = {8,7,5,3,1};

  @Test
  public void wende(){
    Abgabe7a.wende(a);
    assertArrayEquals(ac, a);
  }

}
