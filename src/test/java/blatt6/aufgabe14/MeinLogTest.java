package blatt6.aufgabe14;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MeinLogTest {

  @Test
  public void lnTest() throws SchlechtesArgumentException {
    assertAll("logarithmus",
        () -> assertEquals(1.386,MeinLog.ln(4.0), 0.001),
        () -> assertEquals(0.693,MeinLog.ln(2.0), 0.001),
        () -> assertEquals(0.0,MeinLog.ln(1.0), 0.001),
        () ->assertEquals(-0.6931,MeinLog.ln(0.5), 0.001),
        () ->assertEquals(Double.POSITIVE_INFINITY,MeinLog.ln(Double.POSITIVE_INFINITY), 0.001),
        () ->assertEquals(Double.NEGATIVE_INFINITY,MeinLog.ln(0), 0.001),
        () ->assertThrows(SchlechtesArgumentException.class , () -> MeinLog.ln(-1.0))
    );
  }
}
