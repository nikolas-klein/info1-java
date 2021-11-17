package blatt4.aufgabe10;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GGTTest {

  @Test
  public void ggt(){
    assertEquals(1, GGT.ggt(1,19));
    assertEquals(1, GGT.ggt(19,1));
    assertEquals(12, GGT.ggt(24,36));
    assertEquals(1, GGT.ggt(129,37));
    assertEquals(5, GGT.ggt(225,35));
  }
}
