package blatt5.aufgabe11;

public class FarbPunkt extends Punkt {

  // erbt x,y,getX,getY,
  // verschiebe,inRechteck
  protected int farbe;
  public FarbPunkt(double x1, double y1,
      int f){
    super(x1,y1); farbe = f;}
  public int getFarbe(){return farbe;}
}
