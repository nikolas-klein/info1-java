package blatt9.aufgabe20;

import java.lang.Thread;

public class Elf extends Thread{
    
    Fabrik meineFabrik;

    public Elf(Fabrik fabrik){
        this.meineFabrik = fabrik;
    }

    public void run() {
        Geschenk arbeit_Geschenk = meineFabrik.getArbeit();
        do{
            try {
                if(arbeit_Geschenk != null){
                    this.verarbeite_Geschenk(arbeit_Geschenk);        
                    meineFabrik.abstellen(arbeit_Geschenk);
                    arbeit_Geschenk = meineFabrik.getArbeit();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }while (arbeit_Geschenk!=null);
    }

    private void verarbeite_Geschenk(Geschenk geschenk) throws InterruptedException{
        int verarbeitungsZeit_inSec = geschenk.current_step.getBearbeitsZeit_inSec();
        Thread.sleep(1000*verarbeitungsZeit_inSec);
        geschenk.nextStep();
    }
}
