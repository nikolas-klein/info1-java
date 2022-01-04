package blatt8.aufgabe18;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

public class Analyser {

    ArrayList<RKIDataEntry> arr;
    HashMap<Integer, Long> einwohner_daten;

    public Analyser(ArrayList<RKIDataEntry> rki_data, HashMap<Integer, Long> einwohner_daten){
        this.arr = rki_data;
        this.einwohner_daten = einwohner_daten;
    }
    
    public long getGesamtFallzahl(Bundesland bundesland){
        Stream<RKIDataEntry> p_stream = arr.parallelStream();
        List<RKIDataEntry> filterd_list = p_stream.filter(entry -> entry.bundesland == bundesland).toList();
        long fallzahlen = filterd_list.parallelStream().mapToLong(entry -> (long)entry.getAnzahlFall()).reduce(0, (i,j)-> i+j);
        return fallzahlen;
    }

    public long getGesamtFallzahl(int idLandkreis){
        Stream<RKIDataEntry> p_stream = arr.parallelStream();
        List<RKIDataEntry> filterd_list = p_stream.filter(entry -> entry.idLandkreis == idLandkreis).toList();
        long fallzahlen = filterd_list.parallelStream().mapToLong(entry -> (long)entry.getAnzahlFall()).reduce(0, (i,j)-> i+j);
        return fallzahlen;
    }

    public long getGesamtFallzahl_onDate(int idLandkreis, Date zeitpunkt){
        Stream<RKIDataEntry> p_stream = arr.parallelStream();
        List<RKIDataEntry> filterd_list = p_stream.filter(entry -> entry.idLandkreis == idLandkreis && entry.meldedatum.compareTo(zeitpunkt)==0).toList();
        long fallzahlen = filterd_list.parallelStream().mapToLong(entry -> (long)entry.getAnzahlFall()).reduce(0, (i,j)-> i+j);
        return fallzahlen;
    }

    public double getInzidenzMuenster(Date zeitpunkt){
        double einwohnerzahl = 316403;
        long millisec_24h = (1000 * 60 * 60 * 24);

        //5515 ist Landkreis ID von Muenster

        long date_asLong = zeitpunkt.getTime();
        long sum_fallzahlen = 0;
        for(int i=0; i <=6; i++){
            long currentDate_asLong = date_asLong - (millisec_24h*i);
            Date current_date = new Date();
            current_date.setTime(currentDate_asLong);
            sum_fallzahlen += this.getGesamtFallzahl_onDate(5515,current_date);
        }
        return sum_fallzahlen / einwohnerzahl * 100000;
    }

    public double getInzidenz(int LandkreisId, Date zeitpunkt){
        double einwohnerzahl = (double)this.einwohner_daten.get(LandkreisId);
        long millisec_24h = (1000 * 60 * 60 * 24);

        //5515 ist Landkreis ID von Muenster

        long date_asLong = zeitpunkt.getTime();
        long sum_fallzahlen = 0;
        for(int i=0; i <=6; i++){
            long currentDate_asLong = date_asLong - (millisec_24h*i);
            Date current_date = new Date();
            current_date.setTime(currentDate_asLong);
            sum_fallzahlen += this.getGesamtFallzahl_onDate(5515,current_date);
        }
        return sum_fallzahlen / einwohnerzahl * 100000;
    }

}
