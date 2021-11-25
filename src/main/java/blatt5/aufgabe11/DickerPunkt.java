package blatt5.aufgabe11;

public class DickerPunkt extends Punkt {
  
  protected double r;
  
  public DickerPunkt(double x1,double y1,double r1){
    super(x1,y1); 
    r = r1;
  }
  
  public double flaeche(){
    return Math.PI*r*r;
  }
  
  public boolean inRechteck(double minx, double maxx,double miny, double maxy){
    return ((minx <= x-r) && (x+r <= maxx) && (miny <= y-r) && (y+r <= maxy));
  }
  
}

