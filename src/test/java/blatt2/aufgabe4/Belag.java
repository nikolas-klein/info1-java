package blatt2.aufgabe4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import blatt2.aufgabe4.Belag;
import blatt2.aufgabe4.Kaese;
import blatt2.aufgabe4.Salat;
import blatt2.aufgabe4.Sandwich;
import blatt2.aufgabe4.Toast;
import org.junit.jupiter.api.Test;

class TestBelag {

  Kaese kaese1 = new Kaese(2.5F, 2);
  Kaese kaese2 = new Kaese(5, 1);
  Salat salat1 = new Salat(3.7, 0.5);
  Salat salat2 = new Salat(1.5, 1.5);
  Toast toast1 = new Toast(2);
  Toast toast2 = new Toast(1.25F);
  Belag belag1 = new Belag(kaese1, salat1);
  Belag belag2 = new Belag(kaese2, salat2);
  Sandwich sandwich = new Sandwich(toast1, toast2, belag1);


  @Test
  void BelagGetKosten() {
    assertEquals(belag1.getKosten(), 6.85,0.0001);
    assertEquals(belag2.getKosten(),7.25, 0.0001);
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
