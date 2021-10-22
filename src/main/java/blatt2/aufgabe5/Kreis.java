package blatt2.aufgabe5;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Kreis {
  private float radius;

  public float getDurchmesser(){
    return radius*2.0F;
  }

  public boolean passtInDreieck(Dreieck dreieck){
    //if(getRadius()<=dreieck.getInkreisradius()) { return true;} else return false;
    //return (getRadius()<= dreieck.getInkreisradius()) ? true : false;
    //return Double.compare(this.radius, dreieck.getInkreisradius()) <= 0;
    return getRadius() <= dreieck.getInkreisradius();
  }
}

