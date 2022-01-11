package blatt9.aufgabe20;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Fabrik {
    
    ConcurrentLinkedQueue<Geschenk> imLager_queue = new ConcurrentLinkedQueue<Geschenk>();
    ConcurrentLinkedQueue<Geschenk> produktpruefung_queue = new ConcurrentLinkedQueue<Geschenk>();
    ConcurrentLinkedQueue<Geschenk> einpacken_queue = new ConcurrentLinkedQueue<Geschenk>();
    ConcurrentLinkedQueue<Geschenk> qualitaetssicherung_queue = new ConcurrentLinkedQueue<Geschenk>();
    ConcurrentLinkedQueue<Geschenk> imVersandt_queue = new ConcurrentLinkedQueue<Geschenk>();
    ArrayList<Geschenk> abgefertigt_list = new ArrayList<Geschenk>();

    long in_bearbeitung = 0;
    long anzahl_Geschenke;

    public Fabrik(int anzahl_Geschenke){
        this.anzahl_Geschenke = anzahl_Geschenke;
        this.init_LagerQueue(anzahl_Geschenke);
    }

    private void init_LagerQueue(int anzahl_Geschenke){
        for (int i = 0; i < anzahl_Geschenke; i++) {
            imLager_queue.add(new Geschenk());
        }
    }
    
    public synchronized Geschenk getArbeit(){
        in_bearbeitung += 1;
        
        ArrayList<String> arr = new ArrayList<String>();
        if(imLager_queue.size() > 0){
            arr.add("lager");
        }
        if(produktpruefung_queue.size() > 0){
            arr.add("pruefung");
        }
        if(einpacken_queue.size() > 0){
            arr.add("einpacken");
        }
        if(qualitaetssicherung_queue.size() > 0){
            arr.add("qualitaet");
        }
        if(imVersandt_queue.size() > 0){
            arr.add("versandt");
        }

        Object[] available_cards = arr.toArray();
        java.util.Random random = new java.util.Random();
        int random_computer_card = random.nextInt(available_cards.length);
        String next_work = (String)available_cards[random_computer_card];

      return switch (next_work) {
        case "lager" -> imLager_queue.poll();
        case "pruefung" -> produktpruefung_queue.poll();
        case "einpacken" -> einpacken_queue.poll();
        case "qualitaet" -> qualitaetssicherung_queue.poll();
        case "versandt" -> imVersandt_queue.poll();
        default -> null;
      };
    }

    public synchronized void abstellen(Geschenk geschenk){
        this.printLagerstand();

      switch (geschenk.current_step) {
        case ImLager:
          this.imLager_queue.add(geschenk);
          break;
        case Produktpruefung:
          this.produktpruefung_queue.add(geschenk);
          break;
        case Einpacken:
          this.einpacken_queue.add(geschenk);
          break;
        case Qualitaetssicherung:
          this.qualitaetssicherung_queue.add(geschenk);
          break;
        case ImVersandt:
          this.imVersandt_queue.add(geschenk);
          break;
        case Abgefertigt:
          this.abgefertigt_list.add(geschenk);
          break;
        default:
          break;
      }
        
        in_bearbeitung -= 1;
    }


    public void printLagerstand(){
        System.out.println("###############################################");
        System.out.println("# In Bearbeitung:  " + in_bearbeitung);
        System.out.println("# Lager:           " + imLager_queue.size());
        System.out.println("# Produktpruefung: " + produktpruefung_queue.size());
        System.out.println("# Einpacken:       " + einpacken_queue.size());
        System.out.println("# Qualitaetssicherung:       " + qualitaetssicherung_queue.size());
        System.out.println("# Versandt:       " + imVersandt_queue.size());
        System.out.println("# Abgefertigt:       " + abgefertigt_list.size());
        System.out.println("###############################################");
    }

}
