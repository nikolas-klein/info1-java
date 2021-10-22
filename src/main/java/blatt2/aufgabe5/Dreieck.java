package blatt2.aufgabe5;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Dreieck {

  private float laengeSeite_a;
  private float laengeSeite_b;
  private float laengeSeite_c;

  public float getFlaecheninhalt(){
    float s = (laengeSeite_a+laengeSeite_b+laengeSeite_c)/2;
    return (float)  Math.sqrt(s*(s-laengeSeite_a)*(s-laengeSeite_b)*(s-laengeSeite_c));
  }

  public float getUmfang(){
    return (laengeSeite_a+laengeSeite_b+laengeSeite_c);
  }

  public float getInkreisradius(){
    return (getFlaecheninhalt()*2)/(getUmfang());
  }
}
