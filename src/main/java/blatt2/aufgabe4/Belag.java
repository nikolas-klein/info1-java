package blatt2.aufgabe4;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Belag {

  private Kaese kaese;
  private Salat salat;


  public int getKosten_inCent(){
    return kaese.getPreisInCent()+salat.getPreisInCent();
  }

}
