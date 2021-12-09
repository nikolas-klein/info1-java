package blatt7.aufgabe17;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LandungsmanagerTest {

    Ladung ladung1 = new Ladung(1, 3000, 4000);
    Schiff schiff1 = new Schiff(240000,340000);
    Ladung ladung2 = new Ladung(1, 100002, 403400);
    Ladung ladung3 = new Ladung(1, 30, 200);
    Ladung ladung4 = new Ladung(1, 1222343, 1245);
    Ladung ladung5 = new Ladung(1, 5667, 3255);
    Ladung ladung = new Ladung(1,240000001, 340000d);

    List<Ladung> liste = new ArrayList<Ladung>();
    LadungsManager ladungsManager = new LadungsManager();

    @BeforeEach
    private void init(){
      liste.add(ladung1);
      liste.add(ladung2);
      liste.add(ladung3);
      liste.add(ladung4);
      liste.add(ladung5);
    }

    @Test
    public void passAufSchiffTrue(){
      assertTrue(ladungsManager.passtAufSchiff(schiff1,liste));
    }

  @Test
  public void passAufSchiffFalse(){
    assertFalse(ladungsManager.passtAufSchiff(schiff1,List.of(ladung)));
  }

  @Test
  public void getAnzahlschwererProdukte(){
    assertEquals(2, ladungsManager.getAnzahlSchwereProdukte(liste));
  }
}
