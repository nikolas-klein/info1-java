package blatt3.aufgabe7;

import static blatt3.aufgabe7.Abgabe7b.doppelte;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class Abgabe7bTest {

  private int[] a = {8,7,5,3,8};
  private int[] b = {1,3,5,7,8};
  private int[] c = {0,0,0,0,0};


  @Test
  void doppelteTrue(){
    assertTrue(doppelte(a));
    assertTrue(doppelte(c));
  }

  @Test
  void doppelteFalse(){
    assertFalse(doppelte(b));
  }
}
