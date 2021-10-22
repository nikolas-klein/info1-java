package blatt2.aufgabe5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DreieckTest {

  private final Dreieck dreieck = new Dreieck(12.4F, 5.3F, 8.32F);

  @Test
  void getFlaecheninhalt() {
    assertEquals(16.94, dreieck.getFlaecheninhalt(), 0.001);
  }

  @Test
  void getUmfang() {
    assertEquals(26.02F,dreieck.getUmfang(), 0.001 );
  }

  @Test
  void getInkreisradius() {
    assertEquals(1.302, dreieck.getInkreisradius(),0.001);
  }

  @Test
  void getLaengeSeite_a() {
    assertEquals(12.4F, dreieck.getLaengeSeite_a());
  }

  @Test
  void getLaengeSeite_b() {
    assertEquals(5.3F, dreieck.getLaengeSeite_b());
  }

  @Test
  void getLaengeSeite_c() {
    assertEquals(8.32F, dreieck.getLaengeSeite_c());
  }
}
