package blatt5.aufgabe11;

public class Punkt{
  
  protected double x,y;
  
  public Punkt(double x1, double y1){
    x = x1; y = y1;
  }
  public double getX(){return x;}
  public double getY(){return y;}
  public void verschiebe(double dx,
  double dy){
  x = x+dx; y = y+dy;}
  public boolean inRechteck(
  double minx, double maxx,
  double miny, double maxy){
    return ((minx <= x) && (x <= maxx) &&
  (miny <= y) && (y <= maxy));}
}
