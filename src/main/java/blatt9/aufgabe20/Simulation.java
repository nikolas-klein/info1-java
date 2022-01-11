package blatt9.aufgabe20;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Simulation {
    
    Fabrik fabrik;
    ArrayList<Elf> arbeiter = new ArrayList<Elf>();

    public Simulation(){

    }

    public void start(int anzahl_Geschenke, int anzahl_Elfen){
        this.fabrik = new Fabrik(anzahl_Geschenke);
        this.init_Elfen(anzahl_Elfen);

        for(Elf e : arbeiter){
            e.start();
        }

        for(Elf e : arbeiter){
            try {
                e.join();
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
        }

        System.out.println("Arbeit erledigt");
    }

    private void init_Elfen(int anzahl_Elfen){
        for (int i = 0; i < anzahl_Elfen; i++) {
            arbeiter.add(new Elf(this.fabrik));
        }
    }

    public static void main(String[] args) {
        Simulation sim = new Simulation();
        sim.start(500, 60);
    }

}
