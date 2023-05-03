// Fahrzeug-Klasse
public class Fahrzeug {
    private String marke;
    private String modell;
    private String farbe;
    private String kennzeichen;
    //new Fahrzeug ();


    //Konstruktor 1
    public Fahrzeug() {

    }

    //Konstruktor 2
    public Fahrzeug(String ASD) {
        setMarke(ASD);
    }


    //hier erstellen wir neuer Konstruktor der hat eigene Parameters: "marke", "modell", "farbe" und "kennzeichen".
    // Werte für diese Parameters müssen in die Methode Main angegeben werden
    public Fahrzeug(String marke, String modell, String farbe, String kennzeichen) {
        //hier sind die Methoden zum Wert übergeben an die Parameters
        setMarke(marke);            //Methode setMarke heißt "marke"       ?????????????
        setModell(modell);
        setFarbe(farbe);
        setKennzeichen(kennzeichen);
    }


    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public void setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }
}