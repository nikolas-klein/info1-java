package blatt8.aufgabe18;

public enum Geschlecht{
    Weiblich,
    Männlich,
    Unbekannt;


    public static Geschlecht convert(String text) throws Exception{
        switch (text) {
            case "W":
                return Geschlecht.Weiblich;
            case "M":
                return Geschlecht.Männlich;
            case "unbekannt":
                return Geschlecht.Unbekannt;
            default:
                throw new Exception("Kein passendes Geschlecht gefunden");
        }
    }

}
