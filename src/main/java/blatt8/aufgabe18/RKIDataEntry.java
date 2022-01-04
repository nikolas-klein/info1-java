package blatt8.aufgabe18;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RKIDataEntry {

    static SimpleDateFormat origDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    public int getIdBundesland() {
        return idBundesland;
    }

    public void setIdBundesland(int idBundesland) {
        this.idBundesland = idBundesland;
    }

    public Bundesland getBundesland() {
        return bundesland;
    }

    public void setBundesland(Bundesland bundesland) {
        this.bundesland = bundesland;
    }

    public int getIdLandkreis() {
        return idLandkreis;
    }

    public void setIdLandkreis(int idLandkreis) {
        this.idLandkreis = idLandkreis;
    }

    public String getNameLandkreis() {
        return nameLandkreis;
    }

    public void setNameLandkreis(String nameLandkreis) {
        this.nameLandkreis = nameLandkreis;
    }

    public Altersgruppe getAltergruppe() {
        return altergruppe;
    }

    public void setAltergruppe(Altersgruppe altergruppe) {
        this.altergruppe = altergruppe;
    }

    public Geschlecht getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(Geschlecht geschlecht) {
        this.geschlecht = geschlecht;
    }

    public int getAnzahlFall() {
        return anzahlFall;
    }

    public void setAnzahlFall(int anzahlFall) {
        this.anzahlFall = anzahlFall;
    }

    public int getAnzahlTodesfall() {
        return anzahlTodesfall;
    }

    public void setAnzahlTodesfall(int anzahlTodesfall) {
        this.anzahlTodesfall = anzahlTodesfall;
    }

    public Date getMeldedatum() {
        return meldedatum;
    }

    public void setMeldedatum(Date meldedatum) {
        this.meldedatum = meldedatum;
    }

    public boolean isIstErkrankungsbeginn() {
        return istErkrankungsbeginn;
    }

    public void setIstErkrankungsbeginn(boolean istErkrankungsbeginn) {
        this.istErkrankungsbeginn = istErkrankungsbeginn;
    }

    int idBundesland;
    Bundesland bundesland;
    int idLandkreis;
    String nameLandkreis;
    Altersgruppe altergruppe;
    Geschlecht geschlecht;
    int anzahlFall;
    int anzahlTodesfall;
    Date meldedatum;
    boolean istErkrankungsbeginn;

    public RKIDataEntry(String idBundesland ,String nameBundesland, String nameLandkreis, String altergruppe, String geschlecht, 
        String anzahlFall, String anzahlTodesfall, String Meldedatum, String idLandkreis, String istErkrankungsbeginn) throws Exception{
            this.idBundesland = Integer.parseInt(idBundesland);
            this.bundesland = Bundesland.convert(nameBundesland);
            this.idLandkreis = Integer.parseInt(idLandkreis);
            this.nameLandkreis = nameLandkreis;
            this.altergruppe = Altersgruppe.convert(altergruppe);
            this.geschlecht = Geschlecht.convert(geschlecht);
            this.anzahlFall = Integer.parseInt(anzahlFall);
            this.anzahlTodesfall = Integer.parseInt(anzahlTodesfall);
            this.meldedatum = origDateFormat.parse(Meldedatum);

            if(istErkrankungsbeginn.equals("0")){
                this.istErkrankungsbeginn = false;
            }else{
                this.istErkrankungsbeginn = true;
            }
    }
}
