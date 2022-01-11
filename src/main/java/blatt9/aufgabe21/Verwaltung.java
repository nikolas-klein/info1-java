package blatt9.aufgabe21;

import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Verwaltung {

  protected ArrayList<Geschenk> geschenke = new ArrayList<Geschenk>();

  public void addGeschenk(String bezeichnung, double preis, byte prio){
    geschenke.add(new Geschenk(bezeichnung,preis,prio));
  }

  public void printGeschenk(int index) throws NoSuchFieldException {
    if(geschenke.get(index) != null){
      System.out.println(geschenke.get(index).toString());
    }
    else throw new NoSuchFieldException();
  }

  public Geschenk[] getGeschenke(){
    return geschenke.toArray(new Geschenk[0]);
  }

  public void clear(){
    geschenke.clear();
  }

  public void save(String path){
    this.writeObjectToFile(geschenke, path);
  }

  public void load(String path){

    FileInputStream fileIn;
    ObjectInputStream objectIn;

    try {

      fileIn = new FileInputStream(path);
      objectIn = new ObjectInputStream(fileIn);

      Object obj = null;
      while ((obj = objectIn.readObject()) != null) {
        this.geschenke.add((Geschenk) obj);
      }

      fileIn.close();
      objectIn.close();

    } catch (Exception ignored) {

    }
  }

  private void writeObjectToFile(ArrayList<Geschenk> arr_geschenke, String path) {

    FileOutputStream fileOut;
    ObjectOutputStream objectOut;

    try {
      fileOut = new FileOutputStream(path);
      objectOut = new ObjectOutputStream(fileOut);

      for(Geschenk g: arr_geschenke){
        objectOut.writeObject(g);
      }

      objectOut.close();
      fileOut.close();
      System.out.println("The Object  was succesfully written to a file");

    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
  public static void main(String[] args) throws NoSuchFieldException {
  Verwaltung v = new Verwaltung();
        v.addGeschenk("Zug", 1.0, (byte) 0);
        v.addGeschenk("Schiff", 10.1, (byte) 3);
        v.addGeschenk("Pupe", 2.5, (byte) 1);
        v.save("src/main/resources/liste.save");
        v.clear();
        v.load("src/main/resources/liste.save");

        v.addGeschenk("Rennauto", 1032.1, (byte) 1);
        v.addGeschenk("Kugeln", 0.2, (byte) 2);

  Geschenk[] geschenke = v.getGeschenke();

        for(int i=0; i<geschenke.length;i++){
    if(geschenke[i].getPrioritaet() <= 2){
      v.printGeschenk(i);
    }
  }

  double sum = 0;
        for(Geschenk g: geschenke){
    sum += g.getPreis();
  }

        System.out.println("Summe ist: " + sum);

}

}
