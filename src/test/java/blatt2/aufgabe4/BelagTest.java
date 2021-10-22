package blatt2.aufgabe4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BelagTest {

  Kaese kaese1 = new Kaese(210);
  Kaese kaese2 = new Kaese( 150);
  Salat salat1 = new Salat(50);
  Salat salat2 = new Salat(30);
  Belag belag1 = new Belag(kaese1, salat1);
  Belag belag2 = new Belag(kaese2, salat2);


  @Test
  void BelagGetKosten_inCent() {
    assertEquals(belag1.getKosten_inCent(),260);
    assertEquals(belag2.getKosten_inCent(),180);
  }

  @Test
  void setKaese() {
    belag1.setKaese(kaese2);
    assertEquals(belag1.getKaese(), kaese2);
  }

  @Test
  void getKaese() {
    assertEquals(belag1.getKaese(), kaese1);
  }

  @Test
  void setSalat() {
    belag1.setSalat(salat2);
    assertEquals(belag1.getSalat(), salat2);
  }

  @Test
  void getSalat() {
    assertEquals(belag1.getSalat(), salat1);
  }


}
