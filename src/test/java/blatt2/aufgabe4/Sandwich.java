package blatt2.aufgabe4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestSandwich{

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
  void SandwichgetKosten(){
    assertEquals(sandwich.getKosten(), 10.1, 0.0001);
  }

  @Test
  void getBelag() {
    assertEquals(sandwich.getBelag(), belag1);
  }

  @Test
  void setBelag() {
    sandwich.setBelag(belag2);
    assertEquals(sandwich.getBelag(), belag2);
  }
  @Test
  void getToastOben() {
    assertEquals(sandwich.getToastOben(), toast1);
  }


  @Test
  void setToastOben() {
    sandwich.setToastOben(toast2);
    assertEquals(sandwich.getToastOben(), toast2);
  }


  @Test
  void getToastUnten() {
    assertEquals(sandwich.getToastUnten(), toast2);
  }


  @Test
  void setToastUnten() {
    sandwich.setToastUnten(toast1);
    assertEquals(sandwich.getToastUnten(), toast1);
  }

}
