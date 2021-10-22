package blatt2.aufgabe4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class SandwichTest{

  Kaese kaese1 = new Kaese(210);
  Kaese kaese2 = new Kaese( 150);
  Salat salat1 = new Salat(50);
  Salat salat2 = new Salat(30);
  Toast toast1 = new Toast(120);
  Toast toast2 = new Toast(80);
  Belag belag1 = new Belag(kaese1, salat1);
  Belag belag2 = new Belag(kaese2, salat2);
  Sandwich sandwich = new Sandwich(toast1, toast2, belag1);
  private static final ByteArrayOutputStream out = new ByteArrayOutputStream();
  private static final PrintStream originalOut = System.out;

  @BeforeAll
  public static void setStreams() {
    System.setOut(new PrintStream(out));
  }

  @AfterAll
  public static void restoreInitialStreams() {
    System.setOut(originalOut);
  }

  @Test
  void SandwichgetKosten(){
    assertEquals(460, sandwich.printKosteninEuro());
    assertTrue(out.toString().contains("4,60€"));
  }

  @Test
  void getBelag() {
    assertEquals(belag1, sandwich.getBelag());
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
