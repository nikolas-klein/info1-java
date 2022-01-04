package blatt8.aufgabe18;

public enum Bundesland {
    SchleswigHolstein,
    Niedersachsen,
    NordrheinWestfalen,
    Hessen,
    Hamburg,
    Bremen,
    BadenWuerttemberg,
    Bayern,
    Berlin,
    Brandenburg,
    MecklenburgVorpommern,
    RheinlandPfalz,
    Saarland,
    Sachsen,
    SachsenAnhalt,
    Thueringen;

    public static Bundesland convert(String text) throws Exception{
        switch (text) {
            case "Baden-Württemberg":
                return Bundesland.BadenWuerttemberg;
            case "Bayern":
                return Bundesland.Bayern;
            case "Berlin":
                return Bundesland.Berlin;
            case "Brandenburg":
                return Bundesland.Brandenburg;
            case "Bremen":
                return Bundesland.Bremen;
            case "Hamburg":
                return Bundesland.Hamburg;
            case "Hessen":
                return Bundesland.Hessen;
            case "Mecklenburg-Vorpommern":
                return Bundesland.MecklenburgVorpommern;
            case "Niedersachsen":
                return Bundesland.Niedersachsen;
            case "Nordrhein-Westfalen":
                return Bundesland.NordrheinWestfalen;
            case "Rheinland-Pfalz":
                return Bundesland.RheinlandPfalz;
            case "Saarland":
                return Bundesland.Saarland;
            case "Sachsen":
                return Bundesland.Sachsen;
            case "Sachsen-Anhalt":
                return Bundesland.SachsenAnhalt;
            case "Schleswig-Holstein":
                return Bundesland.SchleswigHolstein;          
            case "Thüringen":
                return Bundesland.Thueringen;                  
            default:
                throw new Exception("Kein passendes Bundesland gefunden");
        }
    }

}
