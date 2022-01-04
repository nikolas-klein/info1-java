package blatt8.aufgabe18;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class DataImporter{

  static SimpleDateFormat origDateFormat = new SimpleDateFormat("yyyy/MM/dd");

  public static void main(String[] args) throws Exception{
    HashMap<Integer, Long> einwohner_daten = read_csv_einwohner("Aufgabe18/Einwohnerzahlen.csv");

    ArrayList<RKIDataEntry> rki_data = read_csv_rki("Aufgabe18/RKI_COVID19.csv");
    Analyser an = new Analyser(rki_data, einwohner_daten);

    Date zeitpunkt = origDateFormat.parse("2021/04/26");
    System.out.println(an.getInzidenz(5515, zeitpunkt));

    System.out.println(an.getGesamtFallzahl(Bundesland.RheinlandPfalz));

    System.out.println(an.getGesamtFallzahl(5515));

    zeitpunkt = origDateFormat.parse("2021/04/26"); //schwierig im Tutorium darauf hinweisen!
    System.out.println(an.getInzidenzMuenster(zeitpunkt));

    System.out.println("test");
  }

  public static ArrayList<RKIDataEntry> read_csv_rki(String path){
    try{
      File myObj = new File(path);
      ArrayList<RKIDataEntry> entriesList = new ArrayList<RKIDataEntry>();

      Scanner myReader = new Scanner(myObj, StandardCharsets.UTF_8); //schwierig im Tutorium darauf hinweisen!
      myReader.nextLine(); //skip first line of csv
      while (myReader.hasNextLine()) {
          String data = myReader.nextLine();
          String[] splitted_String = data.split(",");
          entriesList.add(new RKIDataEntry(splitted_String[1], splitted_String[2], splitted_String[3], splitted_String[4], splitted_String[5], splitted_String[6], splitted_String[7], splitted_String[8], splitted_String[9], splitted_String[16]));
      } 
      myReader.close();
      return entriesList;
    } catch (Exception e){
      System.out.println("RKI csv konnte nicht eingelesen werden");
      e.printStackTrace();
    }
    return null;
  }

  public static HashMap<Integer, Long> read_csv_einwohner(String path){
    try{
      File myObj = new File(path);
      HashMap<Integer, Long> einwohnerzahl_dict = new HashMap<Integer, Long>();

      Scanner myReader = new Scanner(myObj, StandardCharsets.UTF_8);
      myReader.nextLine(); //skip first line of csv
      while (myReader.hasNextLine()) {
          String data = myReader.nextLine();
          String[] splitted_String = data.split(",");
          if(splitted_String.length > 0 && splitted_String[0].length() == 5){
            if (splitted_String.length == 9){ //Kreisname enthaelt ein komma
              einwohnerzahl_dict.put(Integer.parseInt(splitted_String[0].replaceAll("\\s+","")), Long.parseLong(splitted_String[5].replaceAll("\\s+","")));
            }else if (splitted_String.length == 10){ //Kreisname enthaelt kein komma
              einwohnerzahl_dict.put(Integer.parseInt(splitted_String[0].replaceAll("\\s+","")), Long.parseLong(splitted_String[6].replaceAll("\\s+","")));
            }
          }
          
      } 
      myReader.close();
      return einwohnerzahl_dict;

    } catch (Exception e){
      System.out.println("Einwohnerzahl csv konnte nicht eingelesen werden");
      e.printStackTrace();
    }
    return null;
  }


}
