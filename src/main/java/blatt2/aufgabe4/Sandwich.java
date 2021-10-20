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

  public double getKosten(){
    return toastOben.getPreis()+ toastUnten.getPreis() + belag.getKosten();
  }
}
