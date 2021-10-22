package blatt2.aufgabe4;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Sandwich {

  private Toast toastOben;
  private Toast toastUnten;
  private Belag belag;

  public int printKosteninEuro(){
    int kosten = toastOben.getPreisInCent()+ toastUnten.getPreisInCent() + belag.getKosten_inCent();
    String ausgabe = String.valueOf(kosten);
    StringBuilder sb = new StringBuilder(ausgabe);
    sb.reverse().insert(2,',').reverse();
    System.out.println("Die Kosten betragen" + sb +"€");
    return kosten;
  }
}
