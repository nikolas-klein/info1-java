package blatt8.aufgabe18;

public enum Altersgruppe{
    A00toA04,
    A05toA14,
    A15toA34,
    A35toA59,
    A60toA79,
    A80to,
    Unbekannt;


    public static Altersgruppe convert(String text) throws Exception{
        switch (text) {
            case "A00-A04":
                return Altersgruppe.A00toA04;
            case "A05-A14":
                return Altersgruppe.A05toA14;
            case "A15-A34":
                return Altersgruppe.A15toA34;
            case "A35-A59":
                return Altersgruppe.A35toA59;
            case "A60-A79":
                return Altersgruppe.A60toA79;
            case "A80+":
                return Altersgruppe.A80to;
            case "unbekannt":
                return Altersgruppe.Unbekannt;
            default:
                throw new Exception("Keine passende Altersgruppe gefunden");
        }
    }
}
