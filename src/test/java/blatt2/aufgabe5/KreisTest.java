package blatt2.aufgabe5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KreisTest {

  private final Kreis kreis1 = new Kreis(2.4F);
  private final Kreis kreis2 = new Kreis(1.01F);
  private final Dreieck dreieck = new Dreieck(12.4F, 5.3F, 8.32F);

  @Test
  void getDurchmesser() {
    assertEquals(4.8f, kreis1.getDurchmesser(), 0.001);
  }

  @Test
  void passtInDreieckTrue() {
    assertTrue(kreis2.passtInDreieck(dreieck));
  }

  @Test
  void passtInDreieckFalse() {
    assertFalse(kreis1.passtInDreieck(dreieck));
  }

  @Test
  void getRadius() {
    assertEquals(2.4f, kreis1.getRadius(), 0.001);
  }
}
