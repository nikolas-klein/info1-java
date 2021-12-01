package blatt5.aufgabe12;

public class Kugel implements Form{

    protected double radius;

    public Kugel(double radius){
        this.radius = radius;
    }


    @Override
    public double volumen() {
        return 4d/3d*Math.pow(radius,3)*Math.PI;
    }
}
