package blatt9.aufgabe20;

public class Geschenk {
    Bearbeitungsschritt current_step;
    
    public Geschenk(){
        current_step = Bearbeitungsschritt.ImLager;
    }

    public void nextStep(){
        switch(current_step) {
            case ImLager:
                this.current_step = Bearbeitungsschritt.Produktpruefung;
                break;
            case Produktpruefung:
                this.current_step = Bearbeitungsschritt.Einpacken;
                break;
            case Einpacken:
                this.current_step = Bearbeitungsschritt.Qualitaetssicherung;
                break;
            case Qualitaetssicherung:
                this.current_step = Bearbeitungsschritt.ImVersandt;
                break;
            case ImVersandt:
                this.current_step = Bearbeitungsschritt.Abgefertigt;
            default:
                break;
        }
    }
}
