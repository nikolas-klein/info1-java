package blatt5.aufgabe11;

public class DickerFarbPunkt extends Punkt{

    protected int farbe;
    protected double radius;

    public DickerFarbPunkt(double x1, double y1, double radius, int farbe) {
        super(x1, y1);
        this.radius = radius;
        this.farbe = farbe;
    }

    public double getFlaeche(){
        return radius*radius * Math.PI;
    }

    static void main(String[] args){
        DickerFarbPunkt dickerFarbpunkt = new DickerFarbPunkt(1d,1d,1d,1);
        dickerFarbpunkt.verschiebe(1d,1d);
        System.out.println("farbe: "+dickerFarbpunkt.farbe+", position: "+dickerFarbpunkt.x+", "+dickerFarbpunkt.y+ "fläche:"+dickerFarbpunkt.getFlaeche());
    }
}
